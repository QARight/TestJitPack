package com.yl.pack;

import android.util.Base64;

public class YLPacker {
    // Used to load the 'ylpacker' library on application startup.
    static {
        System.loadLibrary("ylpacker");
    }

    /**
     * A native method that is implemented by the 'ylpacker' native library,
     * which is packaged with this application.
     */

    private static native String packJNI(String s);

    private static native String unpackJNI(String s);

    public static String pack(String sourceStr) {
        try {
            String base64Str = packJNI(sourceStr);
            String hexString = HexUtil.toHex(Base64.decode(base64Str, Base64.NO_WRAP));
            return hexString;
        } catch (Exception e) {
            return null;
        }
    }

    public static String unpack(String hexStr) {
        if (null == hexStr) {
            return null;
        }
        try {
            String base64Str = Base64.encodeToString(HexUtil.toByte(hexStr), Base64.NO_WRAP);
            String result = unpackJNI(base64Str);
            if ("native unpack failed".equals(result)) {
                result = null;
            }
            return result;
        } catch (Exception e) {
            return null;
        }
    }

}
