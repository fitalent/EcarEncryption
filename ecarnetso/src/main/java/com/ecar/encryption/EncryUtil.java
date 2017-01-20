package com.ecar.encryption;


public class EncryUtil {
    static {
        System.loadLibrary("ENCRYP");
    }

    //public
    protected static native String mGetMD5Code(String str);

    protected static native String mBinstrToChar(String str);

    protected static native String mBinstrToStr(String str);

    protected static native String mStrToBinstr(String str);

    protected static native String mGetAppendUrl(String str);


    //roadparking
    public static native String mUrlParse(String url);

    public static native String mGetEncryptionValuePair(String url,
                                                        String signKey,
                                                        String appKey,
                                                        String imei,
                                                        String trampTime,
                                                        String sid);

    public static native String mGetEncryptionUrl(String url,
                                                  String key);

    //yitingche
    public static native String mGetEncryptionValuePair_YTC(String url, String signKey, String appKey, String imei, String trampTime, String sid);


    //pda
    public static native String mSign(String url, String signParam, String requestKey);

}
