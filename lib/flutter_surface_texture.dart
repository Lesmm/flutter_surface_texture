
import 'package:flutter/services.dart';

class FlutterSurfaceTexture {

  static const MethodChannel _channel = MethodChannel('flutter_surface_texture');

  static Future<int?> createSurfaceTexture({int surfaceHeight = 0}) async {
    return await _channel.invokeMethod('createSurfaceTexture', {'surfaceHeight': surfaceHeight});
  }

  static Future<void> setSurfaceBufferSize({int surfaceHeight = 0}) async {
    await _channel.invokeMethod('setSurfaceBufferSize', {'surfaceHeight': surfaceHeight});
  }

}
