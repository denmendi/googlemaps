package io.ionic.starter;

import com.hemangkumar.capacitorgooglemaps.CapacitorGoogleMaps;
import com.getcapacitor.BridgeActivity;
import android.os.Bundle;

@PluginMethod()
public void show(PluginCall call) {
  getBridge().executeOnMainThread(new Runnable() {
    @Override
    public void run() {
      if (mapViewParentId != null) {
        View viewToShow = ((ViewGroup) getBridge().getWebView().getParent()).findViewById(mapViewParentId);
        if (viewToShow != null){
          viewToShow.setVisibility(View.VISIBLE);
        }
      }
    }
  });
}
