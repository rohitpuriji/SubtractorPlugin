package rohit.subtractor;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Subtracter extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    
        if (action.equals("performSubtract")) {
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);
            /* Indicating success is failure is done by calling the appropriate method on the 
            callbackContext.*/
            int result = arg1 + arg2;
            callbackContext.success("result calculated in Java: " + result);
            return true;
        }
        return false;
    }


}
