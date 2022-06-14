package com.itheima.string;

public class StringDemo3{
    public static void main(String[] args) {
        //♥️判断相关的方法


        //（1）public boolean equals(object obj):判断调用者与参数的内容是否相同（大小写一致）
        //⚠⚠️：方法的参数是object（没有学习过），默认这里传递到的参数是字符串对象就可以了
        String strOne="今天天气不错";
        String strTwo=new String ("今天天气不错");
        boolean equalsResult=strOne.equals(strTwo);
        System.out.println("strOne和strTwo的内容是否相同："+equalsResult);

        //（2）public boolean equalsIgnoreCase(String anotherString);判断调用者与参数的内容是否相同（忽略大小写一致）

        boolean equalsResultTwo="今天天气不错！ME要出去PLAY一下！".equalsIgnoreCase("今天天气不错！me要出去play一下");
        System.out.println("忽略大小写的前提下，比较的内容结果是否相同"+equalsResultTwo);

        //（3）public boolean contains（String str):判断调用者是否包含参数子字符串，包含true，不包含false
        //⚠️：参数子字符串不限制长度，必须是连续的关系
        boolean containResultOne=strOne.contains("天气");
        boolean containResultTwo=strTwo.contains("不好");
        System.out.println("strOne是否包含子字符串："+containResultOne);
        System.out.println("strTwo是否包含子字符串："+containResultTwo);

    }
}
