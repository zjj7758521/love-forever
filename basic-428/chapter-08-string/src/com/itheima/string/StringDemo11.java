package com.itheima.string;



public class StringDemo11 {
    public static void main(String[] args) {
        //public String replace(String old,String new):将调用者字符串中所有的old子字符串替换为new子字符串并且替换后的内容返回.
        String str ="你TMD会不会玩,真TMD的菜,我今天倒了TMD的血霉碰上TMD你们这帮TMD坑货!";

        String replaceSesult=str.replace("TMD", "***");
        System.out.println("我本身想说的话是："+str);
        System.out.println("过滤后想说的话是："+replaceSesult);





    }
}
