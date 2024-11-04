package com.newbee.random_lib;

import android.text.TextUtils;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/7 0007.
 */

public class RandomUtil {
    private static RandomUtil randomUtil;
    private Random random;
    private RandomUtil() {
        random=new Random();
    }

    public static RandomUtil getInstance() {
        if (randomUtil == null) {
            synchronized (RandomUtil.class) {
                if (randomUtil == null) {
                    randomUtil = new RandomUtil();
                }
            }
        }
        return randomUtil;
    }

    //系统随机字符串总计32个byte
    public int getRandomInt(){
        return random.nextInt();
    }

    //输入1个最大数，然后随机，比如输入100就是0-99
    public int getRandomInt(int numb){
        return random.nextInt(numb);
    }


    //输入长度获取对应长度的数字
    public long getRandomLongByLength(int length){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
           sb.append(random.nextInt(10));
        }

        return Long.valueOf(sb.toString());
    }



    //输入长度获取对应长度的字符串
    public String getRandomString(int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    //输入长度获取对应的数字，并且在该字符串最前面加个指定字符串
    public String getRandomStringTitleAddStr(String str,int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    //获取指定长度的对应字符串，随机字符使用自己输入的字符串
    public String getRandomStringUseCustomString(int length, String str) { // length表示生成字符串的长度
        if(TextUtils.isEmpty(str)){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    //获取指定长度的对应字符串，随机字符使用自己输入的字符组
    public String getRandomStringUseCustomStrings(int length,String... strs){
        if(null==strs||strs.length==0){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(strs.length);
            sb.append(strs[number]);
        }
        return sb.toString();
    }



    //获取指定长度的对应字符串，随机字符使用自己输入的字符组，并且在2个字符之前加个间隔的字符串
    public String getRandomStringUseCustomStringsAddBwStr(int length,String bwStr,String... strs){
        if(null==strs||strs.length==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(strs.length);
            sb.append(strs[number]);
            if(i<length-1){
                sb.append(bwStr);
            }
        }
        return sb.toString();
    }

}
