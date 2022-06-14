package com.itheima.string;

public class StringDemo8 {
    public static void main(String[] args) {
        String str ="今天天气不错，风和日丽，多云转晴，电闪雷鸣";
        //punlic String[] split(String regex):按照切割标志对字符串进行切割，将切割产生的多个内容进行封装到字符串数组中返回

        String[] splitResultArrary=str.split("，");
        for (int i = 0; i <splitResultArrary.length ; i++) {
            System.out.println(splitResultArrary[i]);

        }
    }
}
