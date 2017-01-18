package com.ecar.encryption.RoadPark;

import com.ecar.encryption.EncryUtil;

/*************************************
 * 功能： 路边停车加密
 * 创建者： kim_tony
 * 创建日期：2017/1/17
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class RoadParkEncrypUtil extends EncryUtil {
    public String urlParse(String url) {
        return mUrlParse(url);
    }

    public String getEncryptionValuePair(String url,
                                         String signKey,
                                         String appKey,
                                         String imei,
                                         String trampTime,
                                         String sid) {
        return mGetEncryptionValuePair(
                url,
                signKey,
                appKey,
                imei,
                trampTime,
                sid);
    }

    public String getEncryptionUrl(String url,
                                   String key) {
        return mGetEncryptionUrl(
                url,
                key);
    }
}
