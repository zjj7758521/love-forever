package com.itheima.homework;

public class HomeworkDemo1 {
    public static void main(String[] args) {
        /*
        需求：请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
        例如："abcba"、"上海自来水来自海上"均为对称字符串。
         */
        //"abcba"是对称字符，⚠️定义一个String类型的字符串对象strOne为"abcba"
        String strOne ="abcbh";
        String strTwo="上海自来水来自海上";
        //新建一个StringBuilder对象，为原字符串对象的对立面，用一个新的变量值接收
        StringBuilder sb=new StringBuilder(strOne);
        //运用相反方法，对象名.reverse（）；
        sb. reverse();
        String reverseStrOne = sb.toString();
        //如果原字符串对象与翻转的字符串对象内容相同则为对称字符
        if(strOne.equals(reverseStrOne)){
            System.out.println("abcbh是对称字符");
        }else{
            System.out.println("abcbh不是对称字符");
        }

        //♥️♥️建立StringBuilder类型的字符串，运用reverse方法进行翻转，翻转指向原字符串对象内容，并用一个新的变量接收
        StringBuilder ss=new StringBuilder(strTwo);
        ss.reverse();
        String reverseTwo=ss.toString();
        //♥️♥️如果新的翻转字符串对象的内容和原字符串对象的内容一致，则是对称字符，反之！
        if(strTwo.equals(reverseTwo)){
            System.out.println("上海自来水来自海上是对称字符");
        }else{
            System.out.println("上海自来水来自海上不是对称字符");
        }






    }


}
