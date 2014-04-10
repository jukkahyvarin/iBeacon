package com.jhyvarin.beacon;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.estimote.sdk.Beacon;
import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.Region;
import com.estimote.sdk.Utils;

/**
 * This class echoes a string called from JavaScript.
 */
public class BeaconPlugin extends CordovaPlugin {
	private BeaconManager beaconManager;
	private Beacon beacon;
	private Region region;


    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("ranging")) {
            this.startRanging(callbackContext);
            return true;
        }
        return false;
    }

    private void startRanging(CallbackContext callbackContext) {
	
		beaconManager = new BeaconManager(this);
		 if (!beaconManager.isBluetoothEnabled()) {
		     callbackContext.error("Bluetooth failure");
		 }
		 else {
			callbackContext.success("Bluetoot enabled. Wii...");
		 }
		
    }
}