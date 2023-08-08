#include "include/flutter_surface_texture/flutter_surface_texture_plugin_c_api.h"

#include <flutter/plugin_registrar_windows.h>

#include "flutter_surface_texture_plugin.h"

void FlutterSurfaceTexturePluginCApiRegisterWithRegistrar(
    FlutterDesktopPluginRegistrarRef registrar) {
  flutter_surface_texture::FlutterSurfaceTexturePlugin::RegisterWithRegistrar(
      flutter::PluginRegistrarManager::GetInstance()
          ->GetRegistrar<flutter::PluginRegistrarWindows>(registrar));
}
