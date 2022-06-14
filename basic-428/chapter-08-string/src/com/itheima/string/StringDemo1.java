package com.itheima.string;

public class StringDemo1 {
    public static void main(String[] args) {
        //(1)public String（）；String类的无参构造，创建出来的对象是空字符串
        String strOne=new String();
        System.out.println("通过无参构造创建出来的string对象的内容是"+strOne);
        //（2）public String（char[] chars）：String类的有参构造，将传递进来的字符数组中的内容组合为一个字符串
        //补充⚠️：是一种变相的字符数组转换为字符串的方式
        char[] chars={'黑','马','程','序','员'};
        String starTwo=new String(chars);
        System.out.println("通过有参构造创建出来的string对象的内容是"+starTwo);
        //(3)public String（byte[] byts）：String类的有参构造，会讲数组中的每一个内容先按照码表转换为字符后再组合为字符串
        byte[] byts={65,48};
        String starThree=new String(byts);
        System.out.println("通过有参构造创建出来的string对象的内容是"+starThree);
        //（4）public String（String original）：String类的有参构造，通过传入一个字符串对象创建一个字符串对象，创建出来的字符串对象内容就是参数内容
        String starFour=new String("传智教育");
        System.out.println("通过有参构造创建出来的string对象的内容是"+starFour);
        //（5）⚠️⚠️❤️直接声明String类的引用并且用字符串常量赋值（最方便，效率最高），也是Java推荐的方式，（唯独给字符串赋值可以这么操作）
        String starFive="博学谷";
        System.out.println("通过直接赋值创建出来的string对象的内容是"+starFive);



    }
}
