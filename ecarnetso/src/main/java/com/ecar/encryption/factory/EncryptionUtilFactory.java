package com.ecar.encryption.factory;

import com.ecar.encryption.Epark.EparkEncrypUtil;
import com.ecar.encryption.ParkFee.ParkFeeEncrypUtil;
import com.ecar.encryption.RoadPark.RoadParkEncrypUtil;
import com.ecar.encryption.RoadPda.RoadPdaEncrypUtil;

/*************************************
 * 功能： 创建工具类
 * 创建者： kim_tony
 * 创建日期：2017/1/17
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class EncryptionUtilFactory implements IEncryptionUtilFactory {
    private static EncryptionUtilFactory encryptionUtilFactory;

    private EparkEncrypUtil eparkEncrypUtil;
    private ParkFeeEncrypUtil parkFeeEncrypUtil;
    private RoadParkEncrypUtil roadParkEncrypUtil;
    private RoadPdaEncrypUtil roadPdaEncrypUtil;


    private EncryptionUtilFactory() {
    }


    public static EncryptionUtilFactory getDefault() {
        if (encryptionUtilFactory == null) {
            encryptionUtilFactory = new EncryptionUtilFactory();
        }
        return encryptionUtilFactory;
    }

    @Override
    public EparkEncrypUtil createEpark() {
        return eparkEncrypUtil == null ? eparkEncrypUtil = new EparkEncrypUtil()
                : eparkEncrypUtil;
    }

    @Override
    public ParkFeeEncrypUtil creatParkFee() {
        return parkFeeEncrypUtil == null ? parkFeeEncrypUtil = new ParkFeeEncrypUtil()
                : parkFeeEncrypUtil;
    }

    @Override
    public RoadParkEncrypUtil createRoadPark() {
        return roadParkEncrypUtil == null ? roadParkEncrypUtil = new RoadParkEncrypUtil()
                : roadParkEncrypUtil;
    }

    @Override
    public RoadPdaEncrypUtil createRoadPda() {
        return roadPdaEncrypUtil == null ? roadPdaEncrypUtil = new RoadPdaEncrypUtil()
                : roadPdaEncrypUtil;
    }
}
