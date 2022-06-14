package com.itheima.string;

public class StringDemo6{
    public static void main(String[] args) {
        //♥️♥️publeic String subString(int beginIntdex):从调用者字符串的起始索引beginIntdex开始截取，截取到末尾后返回内容
        //♥️♥️publeic String subString(int beginIntdex,int endIntdex):从调用者字符串的起始索引beginIntdex开始截取，截取endIntdex索引之前返回内容（包头不包尾）


        //截取手机号的案例：来自山东的手机号是137xxxx4375的观众说：你们这节目真难看
        //（1）定义手机号
        String phoneNumber="13723864375";
        String firstPhoneNumber=phoneNumber.substring(0, 3);
        String lastPhoneNumber=phoneNumber.substring(7);
        System.out.println("来自山东的手机号是"+firstPhoneNumber+"xxxx"+lastPhoneNumber+"的观众说：你们这节目真难看");


    }
}
