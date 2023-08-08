import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter_surface_texture/flutter_surface_texture.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  static const int kUninitializedId = -1;

  int _textureId = kUninitializedId;

  int currentSurfaceHeight = 0;

  @override
  void initState() {
    super.initState();
    initTexture();
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  Future<void> initTexture() async {
    int tId = kUninitializedId;
    try {
      tId = await FlutterSurfaceTexture.createSurfaceTexture(surfaceHeight: currentSurfaceHeight) ?? tId;
    } catch (e, s) {
      debugPrint('Failed to create surface texture: $e\n$s');
    }
    _textureId = tId;
    if (!mounted) return;
    setState(() {});
  }

  Future<void> updateTextureHeight() async {
    await FlutterSurfaceTexture.setSurfaceBufferSize(surfaceHeight: currentSurfaceHeight);
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Android Surface Texture Crash'),
        ),
        floatingActionButton: FloatingActionButton(
          child: const Icon(Icons.add),
          onPressed: () {
            setState(() {
              currentSurfaceHeight += 1000;
            });
            updateTextureHeight();
          },
        ),
        body: _textureId == kUninitializedId
            ? const Text('Initializing SurfaceTexture...')
            : SingleChildScrollView(
                child: Column(
                  children: [
                    Text(
                      'currentSurfaceHeight: $currentSurfaceHeight',
                      style: const TextStyle(fontSize: 20),
                    ),
                    Slider.adaptive(
                      value: currentSurfaceHeight.toDouble(),
                      min: 0,
                      max: 50000,
                      onChanged: (newValue) {
                        setState(() {
                          currentSurfaceHeight = newValue.round();
                        });
                        updateTextureHeight();
                      },
                    ),
                    SizedBox(
                      width: 1080,
                      height: currentSurfaceHeight.toDouble(),
                      child: Texture(textureId: _textureId),
                    ),
                  ],
                ),
              ),
      ),
    );
  }
}
