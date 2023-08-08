# flutter_surface_texture

A new Flutter plugin project.

    ````
    flutter create --org com.xpel --template=plugin --platforms=android,ios,linux,macos,windows -a kotlin flutter_surface_texture

    ````

## Only Android

    issue: https://github.com/flutter/flutter/issues/104889
    issue: https://github.com/flutter/flutter/issues/92397


    ````

    texture_example         com...utter_surface_texture_example  E  [SurfaceTexture-0-11252-0] bindTextureImage: error binding external image: 0x502
    flutter                 com...utter_surface_texture_example  E  [ERROR:flutter/fml/platform/android/jni_util.cc(204)] java.lang.RuntimeException: Error during updateTexImage (see logcat for details)
    at android.graphics.SurfaceTexture.nativeUpdateTexImage(Native Method)
    at android.graphics.SurfaceTexture.updateTexImage(SurfaceTexture.java:251)
    at io.flutter.embedding.engine.renderer.SurfaceTextureWrapper.updateTexImage(SurfaceTextureWrapper.java:55)
    flutter                 com...utter_surface_texture_example  A  [FATAL:flutter/shell/platform/android/platform_view_android_jni_impl.cc(1327)] Check failed: fml::jni::CheckException(env).
    libc                    com...utter_surface_texture_example  A  Fatal signal 6 (SIGABRT), code -1 (SI_QUEUE) in tid 11287 (1.raster), pid 11252 (texture_example)
    DEBUG                   crash_dump64                         A  Cmdline: com.xpel.flutter_surface_texture_example
    DEBUG                   crash_dump64                         A  pid: 11252, tid: 11287, name: 1.raster  >>> com.xpel.flutter_surface_texture_example <<<
    DEBUG                   crash_dump64                         A        #01 pc 000000000160f30c  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #02 pc 0000000001635b44  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #03 pc 000000000161baa0  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #04 pc 0000000001610ba8  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #05 pc 00000000016109a0  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #06 pc 0000000001951454  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #07 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #08 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #09 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #10 pc 000000000194920c  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #11 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #12 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #13 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #14 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #15 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #16 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #17 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #18 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #19 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #20 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #21 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #22 pc 0000000001951704  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #23 pc 000000000194a288  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #24 pc 000000000194f8dc  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #25 pc 0000000001945f98  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #26 pc 0000000001958d90  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #27 pc 0000000001957d80  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #28 pc 00000000019585b4  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #29 pc 0000000001959390  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #30 pc 000000000195817c  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #31 pc 0000000001957ee8  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #32 pc 0000000001964628  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #33 pc 00000000016366f4  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #34 pc 000000000163bc30  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #38 pc 000000000163bbb8  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #39 pc 0000000001636650  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)
    DEBUG                   crash_dump64                         A        #40 pc 000000000163a2bc  /data/app/~~fdVk0DORVsn7REz2jhhIag==/com.xpel.flutter_surface_texture_example/lib/arm64/libflutter.so (BuildId: 97334c9189f4a85320258a6c88e3d4edb1572bc1)

    ````

## References

    https://github.com/flutter/flutter/wiki/Hybrid-Composition
    https://github.com/flutter/flutter/wiki/Android-Platform-Views