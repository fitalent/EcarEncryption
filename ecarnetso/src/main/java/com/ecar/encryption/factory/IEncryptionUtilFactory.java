package com.ecar.encryption.factory;

import com.ecar.encryption.IEncryptionUtil;

/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/1/18
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public interface IEncryptionUtilFactory {
    IEncryptionUtil createEpark();//一体化
    IEncryptionUtil creatParkFee();//宜停车
    IEncryptionUtil createRoadPark();//路边(不包含宜停车)
    IEncryptionUtil createRoadPda();//路边PDA
}
