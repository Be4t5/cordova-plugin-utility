package com.utility;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import pl.droidsonroids.casty.*;




public class Utility extends CordovaPlugin {
		
	private Casty casty;
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("discoverCasty")) {
			
			casty = Casty.create(this.cordova.getActivity())
                .withMiniController();

            callbackContext.success("ok");

            return true;

        }
		
		
		else {
            
            return false;

        }
		
		
    }
}
