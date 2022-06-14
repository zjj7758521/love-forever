package com.itheima.input;

      import java.util.Scanner ;

public class InputDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt() ; //✳️阻塞：状态（一直尝试做某事直到成功为止）  直到你在结果出输入数据才可以进行下一步输出打印.

        System.out.println("键盘录入的数据是："+i);

        //注意⚠️：nextInt()方法只可以录入整数数字，不可以接收其他的内容，比如小数或者布尔值.
        //如果想要录入小数，sc.nextDouble() ; 想要录入布尔值，sc.nextBoolean() ;


        //注意⚠️：如果想要录入多个数字，那么需要用nextInt()方法.


        System.out.println("请您输入要录入的数字：");
        int a = sc.nextInt() ;
        System.out.println("键盘录入的数据是："+a);


        System.out.println("请您输入要录入的数字：");
        int f = sc.nextInt() ;
        System.out.println("键盘录入的数据是："+f );
        //想录入几次，就要调用几次sc.nextInt.

    }





}
