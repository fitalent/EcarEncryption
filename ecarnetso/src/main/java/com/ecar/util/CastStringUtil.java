package com.ecar.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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
}
