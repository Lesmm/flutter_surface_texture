package com.xpel.flutter_surface_texture


import android.graphics.SurfaceTexture
import android.view.Surface
import androidx.annotation.NonNull

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

class FlutterSurfaceTexturePlugin : FlutterPlugin, MethodCallHandler {
    private lateinit var mFlutterPluginBinding: FlutterPlugin.FlutterPluginBinding

    private lateinit var channel: MethodChannel

    /**
     * SurfaceTexture and it's Surface
     */
    private lateinit var mSurfaceTexture: SurfaceTexture

    private lateinit var mSurface: Surface

    override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        channel = MethodChannel(flutterPluginBinding.binaryMessenger, "flutter_surface_texture")
        channel.setMethodCallHandler(this)
        mFlutterPluginBinding = flutterPluginBinding
    }

    override fun onMethodCall(@NonNull call: MethodCall, @NonNull result: Result) {
        when (call.method) {
            "createSurfaceTexture" -> {
                val surfaceWidth = call.argument<Int>("surfaceWidth") ?: 1080
                val surfaceHeight = call.argument<Int>("surfaceHeight") ?: 0
                val textureId = generateSurfaceTexture(surfaceWidth, surfaceHeight)
                result.success(textureId)
            }

            "setSurfaceBufferSize" -> {
                val surfaceWidth = call.argument<Int>("surfaceWidth") ?: 1080
                val surfaceHeight = call.argument<Int>("surfaceHeight") ?: 0
                setSurfaceBufferSize(surfaceWidth, surfaceHeight)
                result.success(null)
            }

            else -> {
                result.notImplemented()
            }
        }
    }

    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
    }

    /**
     * Util Method for Generate SurfaceTexture and Surface
     */

    private fun generateSurfaceTexture(surfaceWidth: Int, surfaceHeight: Int): Long {
        val surfaceTextureEntry = mFlutterPluginBinding.textureRegistry.createSurfaceTexture()
        mSurfaceTexture = surfaceTextureEntry.surfaceTexture()
        mSurfaceTexture.setDefaultBufferSize(surfaceWidth, surfaceHeight)
        mSurface = Surface(mSurfaceTexture)
        val canvas = mSurface.lockCanvas(null)
        canvas.drawRGB(255, 230, 15)
        mSurface.unlockCanvasAndPost(canvas)
        return surfaceTextureEntry.id()
    }

    private fun setSurfaceBufferSize(surfaceWidth: Int, surfaceHeight: Int) {
        mSurfaceTexture.setDefaultBufferSize(surfaceWidth, surfaceHeight)
        val canvas = mSurface.lockCanvas(null)
        canvas.drawRGB(255, 230, 15)
        mSurface.unlockCanvasAndPost(canvas)
    }
}
