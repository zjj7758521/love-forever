package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //可以在main方法中进行方法的调用（实际上在其他的方法中调用是可以的）
        //最基本的方法调用格式⚠️⚠️⚠️：方法名();
        //一个类里面可以定义多个方法，这些方法不冲突

        playGame();
        System.out.println("睡不着，逛个淘宝吧");
        taobaoShopping();
        System.out.println("玩了游戏，买了包包，睡觉吧");
        sleeping();
    }


    //方法的定义前提：方法与方法之间是平级的，不是嵌套关系
    /*
    最基本方法的定义格式：⚠️⚠️⚠️⚠️
    public static void 方法名（）{

    方法体；（代码）

    }
     */
    public static void playGame(){
        System.out.println("打开电脑");
        System.out.println("登陆游戏");
        System.out.println("开始排位");
        System.out.println("选择英雄->鲁班！");
        System.out.println("送了20个人头");
        System.out.println("打字怒喷，队友真垃圾");
        System.out.println("不玩了，睡觉");

    }

    public static void taobaoShopping() {
        System.out.println("打开淘宝");
        System.out.println("登陆账户");
        System.out.println("看看上衣");
        System.out.println("不好看");
        System.out.println("看看短裤");
        System.out.println("算了吧");
        System.out.println("想买个包");
        System.out.println("买它！");
        System.out.println("就买它买它买它！！！");

    }

    public static void sleeping() {
        System.out.println("洗脸");
        System.out.println("敷面膜");
        System.out.println("护肤一下");
        System.out.println("和亲爱的吐槽一下老板");
        System.out.println("真tm无语");
        System.out.println("不说了，睡觉吧");
        System.out.println("呼噜呼噜呼噜～～");

    }
}
