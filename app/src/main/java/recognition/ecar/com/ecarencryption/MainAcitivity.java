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
        printResult();
    }


    private void printResult() {
//         公用方法
        isEquels("binstrToStr",
                "43f6d04f2070db68d1254863f3918669",
                (EncryptionUtilFactory.getDefault(true).createEpark().binstrToStr(
                        "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001"

                )));
        isEquels("getEncodedStr",
                "1.1.3-NotMinify%E6%B5%8B%E8%AF%95",
                (EncryptionUtilFactory.getDefault(true).createEpark().getEncodedStr(
                        "1.1.3-NotMinify测试"
                )));
        isEquels("strToBinstr",
                "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001",
                (EncryptionUtilFactory.getDefault(true).createEpark().strToBinstr(
                        "43f6d04f2070db68d1254863f3918669"
                )));
        isEquels("binstrToChar",
                "4",
                ("" + EncryptionUtilFactory.getDefault(true).createEpark().binstrToChar(
                        "110100"
                )));
        isEquels("getAppendUrl",
                "http://192.168.0.115:7072//Index.aspx?versontype=1&t=member&method=invoiceapply&money=1000&phonenum=18923729010&title=%E5%8F%91%E7%A5%A8&parkuserid=16112518923729010",
                (EncryptionUtilFactory.getDefault(true).createEpark().getAppendUrl(
                        "http://192.168.0.115:7072//Index.aspx?versontype=1&t=member&method=invoiceapply",
                        "{money=1000, phonenum=18923729010, title=%E5%8F%91%E7%A5%A8}",
                        "16112518923729010"
                )));
        isEquels("getMD5Code",
                "8ea1f5cfde78541acb2970f5aabe9843",
                (EncryptionUtilFactory.getDefault(true).createEpark().getMD5Code(
                        "{abc:缺少参数}"
                )));

//        一体化
        isEquels("checkSign",
                "true",
                ("" + EncryptionUtilFactory.getDefault(true).createEpark().checkSign(
                        "1ba56e9614e143fed388bca2d70576e8",
                        "{\"message\":\"缺少参数\",\"ngis\":\"1ba56e9614e143fed388bca2d70576e8\",\"state\":2,\"ts\":1484818412833}",
                        "1000100 110011 110000 110010 111001 1000011 110111 110011 110100 110000 110110 110010 110010 110001 1000010 110000 110010 110000 110010 110110 1000010 110110 111000 110100 1000010 1000010 110000 110000 110101 110111 111001 1000011"
                )));
        isEquels("getSecurityKeys",
                "ClientType=android&appId=904075102&cityname=&comid=200000002&latitude=4.9E-324&longitude=4.9E-324&method=addUseRecord&module=app&phonetype=SM705&service=Std&ts=1486606389319&u=20160510190532888742623268038887&v=20170113111620773151170099329112&ve=2&versin=1.1.4-%E5%BC%80%E5%8F%91&sign=146c0a4b64916874f584669656d87820",
                (EncryptionUtilFactory.getDefault(true).createEpark().getSecurityKeys(
                        "{ClientType=android, appId=904075102, cityname=, comid=200000002, latitude=4.9E-324, longitude=4.9E-324, method=addUseRecord, module=app, phonetype=SM705, service=Std, ts=1486606389319, u=20160510190532888742623268038887, v=20170113111620773151170099329112, ve=2, versin=1.1.4-开发}",
                        "111001 110000 110100 110000 110111 110101 110001 110000 110010",
                        "1000100 110011 110000 110010 111001 1000011 110111 110011 110100 110000 110110 110010 110010 110001 1000010 110000 110010 110000 110010 110110 1000010 110110 111000 110100 1000010 1000010 110000 110000 110101 110111 111001 1000011",
                        true,
                        true
                )));
        isEquels("getSecurityMapKeys",
                "{ClientType=android, method=appLogin, module=app, service=Std, sign=56881eec8b018639427a0c6570e43e5a, ts=1487385892494, userPhoneNum=18670006357, userPwd=dc483e80a7a0bd9ef71d8cf973673924}",
                EncryptionUtilFactory.getDefault(true).createEpark().getSecurityMapKeys(
                        "{ClientType=android, method=appLogin, module=app, service=Std, ts=1487385892494, userPhoneNum=18670006357, userPwd=dc483e80a7a0bd9ef71d8cf973673924}",
                        true,
                        true,
                        false,
                        "",
                        "D3029C73406221B02026B684BB00579C"
                ));
//        路边
        isEquels("urlParse",
                "http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705",
                (EncryptionUtilFactory.getDefault(true).createRoadPark().urlParse(
                        "http://192.168.0.115:7072//Index.aspx?versontype=1&t=other&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705"
                )));

        isEquels("getEncryptionUrl",
                "http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705&appkey=101280918&security=5fcc6f9cde4e7bca2690488b59d15abf&mobilecode=864593021622278&timestamp=20240117130708&SID=&sign=54be918cb627326f3d5185d06eb5817f",

                EncryptionUtilFactory.getDefault(true).createRoadPark().getEncryptionUrl(
                        " http://192.168.0.115:7072//otherapi/Index.aspx?versontype=1&method=getappversion&versioncode=14&versionname=1.2.1&ostype=android&phonemodel=SM705&appkey=101280918&security=5fcc6f9cde4e7bca2690488b59d15abf&mobilecode=864593021622278&timestamp=20240117130708&SID=",
                        "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001"
                )
        );

        isEquels("getEncryptionValuePair",
                "http://szchmtech.3322.org:7072/memberapi/Index.aspx?versontype=1&method=getrechargelimit&appkey=101280918&security=a4fcfb7323f9bc7b9503e961d97b93e0&mobilecode=355066066194848&timestamp=20170109195613&SID=side26e7777fdb60dc96fdbebb94dbd480c&sign=868f171b70278179a018bbc683ddc329",
                EncryptionUtilFactory.getDefault(true).createRoadPark().getEncryptionValuePair(
                        "http://szchmtech.3322.org:7072/memberapi/Index.aspx?versontype=1&method=getrechargelimit",
                        "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001",
                        "110001 110000 110001 110010 111000 110000 111001 110001 111000",
                        "355066066194848",
                        "20170109195613",
                        "side26e7777fdb60dc96fdbebb94dbd480c")
        );

//        宜停车
        isEquels(
                "getEncryptionValuePair_YiTingChe",
                "http://192.168.0.115:7072//memberapi/Index.aspx?versontype=1&method=balanceinquiry&parkuserid=16112518923729010&appkey=101280918&security=1f59cd3e694079d639319338dbad5069&mobilecode=355066066194848&timestamp=20170110111959&SID=sidf0314ac0118b4e648698914262ea7db7&sign=bea13df1f202159a2d9c85ee3e299b53",

                EncryptionUtilFactory.getDefault(true).creatParkFee().getEncryptionValuePair_YiTingChe(
                        "http://192.168.0.115:7072//memberapi/Index.aspx?versontype=1&method=balanceinquiry&parkuserid=16112518923729010",
                        "110100 110011 1100110 110110 1100100 110000 110100 1100110 110010 110000 110111 110000 1100100 1100010 110110 111000 1100100 110001 110010 110101 110100 111000 110110 110011 1100110 110011 111001 110001 111000 110110 110110 111001",
                        "110001 110000 110001 110010 111000 110000 111001 110001 111000",
                        "355066066194848",
                        "20170110111959",
                        "sidf0314ac0118b4e648698914262ea7db7"
                )
        );

//        路边PDA
        isEquels("sign",
                "http://183.62.162.254:8899/OperationAPI/Index.aspx?method=equipinfo&sign=c131fea6fe173474e30b26ed7e073a49",

                EncryptionUtilFactory.getDefault(true).createRoadPda().sign(
                        "http://183.62.162.254:8899/OperationAPI/Index.aspx?method=equipinfo",
                        "[Appkey=606300949, Security=5b82066ec0544ecc66d5ed62a7bce3de, adduserid=746, equiptype=1, faultcode=03, ordercontent=下半年你先休息, MD50=961524aa7d3a17bcf869227afa8604a2]",
                        "e40a1c78080249df994eaedb833d0434"
                )
        );
    }

    private void isEquels(String method, String str1, String str2) {
        Log.d("tagutil", method + "标准值=" + str1);
        Log.d("tagutil", method + " 加密后=" + str2);

        if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
            Log.d("tagutil", method + "  result: " + str1.trim().equals(str2.trim()));
        }else{
            Log.d("tagutil", method + "  result: " + false);
        }
    }
}

