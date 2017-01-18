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
      例子：路边停车urlParse
      String newUrl= EncryptionUtilFactory.getDefault().createRoadPark().urlParse(String url);
