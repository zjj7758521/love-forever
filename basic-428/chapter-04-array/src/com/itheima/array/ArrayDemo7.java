package com.itheima.array;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //案例：数组遍历的方式：核心内容（数组长度的获取）：  ⚠️⚠️⚠️数组名.length; 来获取到数组的长度

        int[] a =new int[]{10,20,30,40,50};
        int length =a.length ;
        System.out.println("数组的长度是"+length);

        //⚠️⚠️注意：数组.length 只可以获取，例如：a.length =20；❌ 不可以给数组的长度赋值，因为一旦确定长度就不允许发生更改

        /*遍历的核心内容：
        （1）先初始化一个"索引值"作为初始表达式：int i=0；（默认从0索引开始获取）
        （2）i<数组名.length;(i最大可以取值为数组的长度—1）
        （3）i++；
         */
        for(int i=0;i <a.length;i ++){
            //每次循环体中都可以使用i作为索引来获取数组中的每一个元素.
            System.out.println("数组中"+i+"索引的内容是："+a[i]);
        }
    }
}
