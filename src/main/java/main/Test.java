package main;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.math.MathUtil;
import cn.hutool.json.JSONObject;


import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","JackSon");
        JSONObject json = new JSONObject(map);
        System.out.println(json.toString());
        String encode = Base64.encode(map.toString().getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);
        byte[] decode = Base64.decode(encode.getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(decode));

    }
}
