package com.itheima.string;

public class StringDemo5 {
    public static void main(String[] args) {
        //♥️获取相关的方法

        String str="今天天气不错，电闪雷鸣，我要出去放风筝！";
        //✨‼️（1）获取字符串长度，注意这里的lengt是一个方法，str.length();⚠️数组的length是一个属性=》arr.length;
        //public int length();获取字符串的长度（获取字符串字符的个数0
        int length=str.length();
        System.out.println("字符串str的长度是："+length);

        //(2)拼接字符串：public String concat(String str):将传递的参数拼接到调用者字符串内容的后面，并返回接收的结果
        //⚠️：会将拼接后的返回，要接收结果，不返回没有任何意义
        String concatResult=str.concat("顺便渡劫");
        System.out.println("拼接了内容之后，拼接的结果是："+concatResult);
        System.out.println("拼接了内容之后，原本调用者的内容是："+str);

        //(3)获取指定索引字符串：获取指定索引处的字符并返回，public char charAt(int index)
        //字符串字符也是有索引的，和索引特点一致，⚠️第一个字符的索引是0，最后一个字符的索引是【字符串.length-1 】
        char char0=str.charAt(0);
        char charLast=str.charAt(str.length()-1);
        System.out.println("0索引的字符是："+char0);
        System.out.println("最后索引的字符是："+charLast);

        //遍历字符获取每一个字符的方式
        //⚠️♥️
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        //（4）子字符串位置：public int indexOf(String str):获取子字符串在调用者字符中第一次出现的索引
        System.out.println("天气子字符串第一次出现的索引是："+str.indexOf("天气"));
        System.out.println("天气子字符串第一次出现的索引是："+str.indexOf("电闪雷鸣"));

        //（5）子字符串位置：public int lastIndexOf(String str):获取子字符串在调用者字符中最后一次出现的索引
        System.out.println("天气子字符串第一次出现的索引是："+str.lastIndexOf("天"));


    }
}
