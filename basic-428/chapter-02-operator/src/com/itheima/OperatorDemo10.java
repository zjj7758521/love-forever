package com.itheima;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class OperatorDemo10 {
    public static void main(String[] args) {
        //比较运算符/关系运算符：用于比较两个数据关系（相等/不相等/大于小于)
        //比较运算符/关系运算符进行运算之后肯定会得到一个boolean类型的结果.


        //=：用于判断左边和右边的数据是否相同.
        int a = 10;
        int b =20;
        int c =97;
        boolean resulteOne =a == b;//先计算a==b的结果，再将结果赋值给boolean类型的resoluteOne变量
        System.out.println("a==b的结果是："+ resulteOne);
        System.out.println("a==c的结果是："+(a == c));

        //注意（1）：不同数据类型的变量能不能比较：能（只看数据，不看类型）
        long d = 10L;
        System.out.println("a==d的结果是："+(a == d));

        double e = 10.0;
        System.out.println("a==e的结果是："+(a == e));

        char f ='c';
        System.out.println("c==f的结果是："+(c == f));


        //注意：除了数值型之外，非数值型boolean类型也可以用==和！=进行比较；
        boolean flagOne = true;
        boolean flagTwo = true;
        System.out.println("flagOne==flagTwo的结果是："+(flagOne==flagTwo));

        //!=:用于判断左边和右边的数据是否不相同.
        System.out.println("a!=c的结果是："+(a!=c));
    }
}
