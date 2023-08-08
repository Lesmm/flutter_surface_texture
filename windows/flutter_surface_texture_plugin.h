#ifndef FLUTTER_PLUGIN_FLUTTER_SURFACE_TEXTURE_PLUGIN_H_
#define FLUTTER_PLUGIN_FLUTTER_SURFACE_TEXTURE_PLUGIN_H_

#include <flutter/method_channel.h>
#include <flutter/plugin_registrar_windows.h>

#include <memory>

namespace flutter_surface_texture {

class FlutterSurfaceTexturePlugin : public flutter::Plugin {
 public:
  static void RegisterWithRegistrar(flutter::PluginRegistrarWindows *registrar);

  FlutterSurfaceTexturePlugin();

  virtual ~FlutterSurfaceTexturePlugin();

  // Disallow copy and assign.
  FlutterSurfaceTexturePlugin(const FlutterSurfaceTexturePlugin&) = delete;
  FlutterSurfaceTexturePlugin& operator=(const FlutterSurfaceTexturePlugin&) = delete;

 private:
  // Called when a method is called on this plugin's channel from Dart.
  void HandleMethodCall(
      const flutter::MethodCall<flutter::EncodableValue> &method_call,
      std::unique_ptr<flutter::MethodResult<flutter::EncodableValue>> result);
};

}  // namespace flutter_surface_texture

#endif  // FLUTTER_PLUGIN_FLUTTER_SURFACE_TEXTURE_PLUGIN_H_
