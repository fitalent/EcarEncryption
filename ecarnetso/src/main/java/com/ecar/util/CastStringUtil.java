package com.ecar.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/1/20
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class CastStringUtil {

    /**
     *
     * 函数名称: parseData
     * 函数描述: 将json字符串转换为map
     * @param data
     * @return
     */
    public static TreeMap<String, String> jsonToMap(String data){
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        TreeMap<String, String> map = g.fromJson(data, new TypeToken<TreeMap<String, String>>() {}.getType());
        return map;
    }
    public static TreeMap<String, String> stringToTreeMap(String singInfo) {

        String str1 = singInfo.replaceAll("\\{|\\}", "");//singInfo是一个map  toString后的字符串。
        String str2 = str1.replaceAll(" ", "");
        String str3 = str2.replaceAll(",", "&");


        TreeMap<String, String> map = new TreeMap<>();
        if (!TextUtils.isEmpty(str3)) {
            String[] resArray = str3.split("&");
            if (0 != resArray.length) {
                for (String arrayStr : resArray) {
                    if (!TextUtils.isEmpty(arrayStr)) {
                        int index = arrayStr.indexOf("=");
                        if (-1 != index) {
                            map.put(arrayStr.substring(0, index), arrayStr.substring(index + 1));
                        }
                    }
                }
            }
        }

        return map;
    }
}
