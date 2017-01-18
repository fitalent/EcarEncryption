使用方法
======================================


1.获取相应项目Utill
------------------------------------------
   public class EncryptionUtilFactory implements IEncryptionUtilFactory {
   
    ...
    
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
    
    2.调用加密方法
------------------------------------------
    例子：路边停车
    EncryptionUtilFactory.getDefault().createRoadPark().urlParse(
//                        ""
                        "http://192.168.0.115:7072//Index.aspx?versontype=1&t=other&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705"
                   )
