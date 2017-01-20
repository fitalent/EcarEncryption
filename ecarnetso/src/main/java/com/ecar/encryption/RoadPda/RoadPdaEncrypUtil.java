package com.ecar.encryption.RoadPda;

import com.ecar.encryption.EncryUtilImpl;
import com.ecar.util.TagUtil;

/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/1/17
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class RoadPdaEncrypUtil extends EncryUtilImpl {

    public String sign(String url,
                       String signParam,
                       String requestKey) {
        String result = mSign(
                url,
                signParam,
                requestKey);

        TagUtil.printResult(result);
        return result == null ? "" : result;

    }

}
