package com.ecar.encryption;


import com.ecar.util.TagUtil;

import static com.ecar.util.TagUtil.printResult;

public class EncryUtilImpl extends EncryUtil {
    public String getEncryptionValuePair(
            String url,
            String signKey,
            String appKey,
            String imei,
            String trampTime,
            String sid) {

        String result = mGetEncryptionValuePair_YTC(
                url,
                signKey,
                appKey,
                imei,
                trampTime,
                sid);

        printResult(result);
        return result == null ? "" : result;

    }

    public String urlParse(String url) {
        return mUrlParse(url);
    }

    public String getEncryptionValuePair_YiTingCHe(String url,
                                         String signKey,
                                         String appKey,
                                         String imei,
                                         String trampTime,
                                         String sid) {
        String result = mGetEncryptionValuePair(
                url,
                signKey,
                appKey,
                imei,
                trampTime,
                sid);
        TagUtil.printResult(result);

        return result == null ? "" : result;

    }

    public String getEncryptionUrl(String url,
                                   String key) {
        String result = mGetEncryptionUrl(
                url,
                key);
        TagUtil.printResult(result);

        return result == null ? "" : result;

    }



}
