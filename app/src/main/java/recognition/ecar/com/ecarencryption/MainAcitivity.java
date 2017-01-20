package recognition.ecar.com.ecarencryption;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.ecar.factory.EncryptionUtilFactory;


/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/1/16
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class MainAcitivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                printResult();
            }
        }).start();
    }



    private void printResult() {

//        isEquels("http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705",
//                (EncryptionUtilFactory.getDefault(true).createRoadPark().urlParse(
//                        "http://192.168.0.115:7072//Index.aspx?versontype=1&t=other&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705"
//                )));

//        isEquels(EncryptionUtilFactory.getDefault(true).createRoadPark().getEncryptionUrl(
//                " http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705&appkey=101280918&security=5fcc6f9cde4e7bca2690488b59d15abf&mobilecode=864593021622278&timestamp=20240117130708&SID=",
////                 "",
//                "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001"
//                ),
//                "http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705&appkey=101280918&security=5fcc6f9cde4e7bca2690488b59d15abf&mobilecode=864593021622278&timestamp=20240117130708&SID=&sign=54be918cb627326f3d5185d06eb5817f"
//        );

        isEquels(EncryptionUtilFactory.getDefault(true).createRoadPark().getEncryptionValuePair(
                " http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705",
                "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001",
                "110001 110000 110001 110010 111000 110000 111001 110001 111000",
                "864593021622278",
                "20240117130708",
                ""),
                "http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705&appkey=101280918&security=5fcc6f9cde4e7bca2690488b59d15abf&mobilecode=864593021622278&timestamp=20240117130708&SID=&sign=54be918cb627326f3d5185d06eb5817f"
        );
//        isEquels(EncryptionUtilFactory.getDefault(true).creatParkFee().getEncryptionValuePair(
//                "http://192.168.0.115:7072//transactionapi/Index.aspx?versontype=1&method=parking&parkuserid=16112518923729010",
//                "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001",
//                "110001 110000 110001 110010 111000 110000 111001 110001 111000",
//                "352571070386572",
//                "20170118161016",
//                "20170118161016"
//                ),
//                "http://183.62.162.254:8899/transactionapi/Index.aspx?versontype=1&method=parking&parkuserid=15041418923729010&appkey=101280918&security=9c5fa30e1d52ecf7fcfc28c6c018271f&mobilecode=864593021622278&timestamp=20170117142237&SID=sid2fa6b1f6a21fd90850cdec8b1ddcec7c&sign=e0239f878302ac074ba3c0ee6a0fbb81"
//        );
//        isEquels(EncryptionUtilFactory.getDefault(true).createRoadPda().sign(
//                "http://183.62.162.254:8899/OperationAPI/Index.aspx?method=equipinfo",
//                "[Appkey=606300949, Security=5b82066ec0544ecc66d5ed62a7bce3de, adduserid=746, equiptype=1, faultcode=03, ordercontent=下半年你先休息, MD50=961524aa7d3a17bcf869227afa8604a2]",
//                "e40a1c78080249df994eaedb833d0434"
//                ),
//                "http://183.62.162.254:8899/OperationAPI/Index.aspx?method=equipinfo&sign=c131fea6fe173474e30b26ed7e073a49"
//        );
    }

    private void isEquels(String str1, String str2) {
        Log.d("tagutil", "isEquels: str1=" + str1);
        Log.d("tagutil", "isEquels: str2=" + str2);

        if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2))
            Log.d("tagutil", "isEquels: " + str1.trim().equals(str2.trim()));
    }
}

