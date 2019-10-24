package com.seidor.uhfrfid;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.seuic.uhf.UHFService;
import com.seidor.uhfrfid.InventoryFragement;

/**
 * This class echoes a string called from JavaScript.
 */
public class PluginAutoid9U extends CordovaPlugin {
	private CallbackContext receiveScanCallback;
    	private InventoryFragement inventoryFragement = null;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        JSONObject my_obj = new JSONObject();
        inventoryFragement = InventoryFragement.getInstance();
        if(action.equals("singleTag")) {
            my_obj = inventoryFragement.singleTag();
            callbackContext.success(my_obj);
            return true;
        } else if(action.equals("open")) {
            my_obj.put("result",inventoryFragement.open());
            callbackContext.success(my_obj);
            return true;
        } else if(action.equals("close")) {
            inventoryFragement.close();
            my_obj.put("result", "true");
            callbackContext.success(my_obj);
            return true;
        }
        return false;
    }

}
