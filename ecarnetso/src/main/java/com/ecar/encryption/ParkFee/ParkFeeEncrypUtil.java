package com.ecar.encryption.ParkFee;

import com.ecar.encryption.EncryUtil;

/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/1/17
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class ParkFeeEncrypUtil extends EncryUtil {
    public String getEncryptionValuePair(
            String url,
            String signKey,
            String appKey,
            String imei,
            String trampTime,
            String sid) {
        return mGetEncryptionValuePair_YTC(
                url,
                signKey,
                appKey,
                imei,
                trampTime,
                sid);
    }

}
