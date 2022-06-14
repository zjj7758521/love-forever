package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //1.用三个int类型的变量分别表示一个玩家的人物等级,人物金钱,人物攻击力！
        int level = 1;
        int money =1000;
        int aggressivity = 10;


        //重点：在打印变量的时候，可以在变量的前面拼接一个字符串常量，用+拼接出来（打印出来的时候字符串和变量的内容会一起打印）
        System.out.println("人物的等级是："+ level);
        System.out.println("人物的存款是："+ money);
        System.out.println("人物的攻击力是："+ aggressivity );


        //2.模拟人物用500元买了一个首充大礼包（等级涨了100级  金钱少了500  攻击力加了1000）.
        System.out.println("人物开始和Boss进行PK！人物攻击了BOSS，BOSS血量-1！");
        System.out.println("人物开始和Boss进行PK！BOSS攻击了人物，人物灰飞烟灭！");
        System.out.println("人物花费500元购买了首充大礼包！购买后人物的属性是：");


        //修改变量值：变量名 =  修改后的值; （值的类型和变量的类型要匹配）

        level = 101;
        money = 500;
        aggressivity  = 1010;

        System.out.println("人物的等级是："+level);
        System.out.println("人物的存款是："+money);
        System.out.println("人物的攻击力是："+aggressivity );
    }
}
