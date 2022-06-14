package com.itheima;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //%:表示取模/取余/模，可以让多个数据进行相除获取余数（会产生一个结果，对于这个结果要进行接受）单独写一个式子没有意义//
        //取模/取余/模之后的应用（1）：计算奇数偶数
        System.out.println("奇数对2取余（7%2）：" +(7%2)) ;
        System.out.println("奇数对2取余（17%2）：" +(17%2));
        System.out.println("偶数对2取余（18%2）：" +(18%2));
        System.out.println("负奇数对2取余（-17%2）：" +(-17%2));
        System.out.println("负偶数对2取余（-18%2）：" +(-18%2));


        //取模/取余/模之后的应用（2）：计算某个数是否是另外一个数的倍数
        System.out.println("20是否是4的整数倍（20%4）：" +(20%4));
        System.out.println("21是否是4的整数倍（21%4）：" +(21%4));
        System.out.println("22是否是4的整数倍（22%4）：" +(22%4));
        System.out.println("23是否是4的整数倍（23%4）：" +(23%4));
        System.out.println("24是否是4的整数倍（24%4）：" +(24%4));

        //取模/取余/模之后的规律（1）：小数对大数取余，结果恒为小数本身.
        System.out.println("小数对大数取于（3 % 5）："+(3 % 5));
        System.out.println("小数对大数取于（13 % 176）："+(13 % 176));
        System.out.println("小数对大数取于（23 % 25）："+(23 % 25));



        //取模/取余/模之后的规律（2）：任意一个正整数A对另外一个正整数B取余，结果有B种
        System.out.println("0 % 3的结果是："+ (0% 3));
        System.out.println("1 % 3的结果是："+ (1% 3));
        System.out.println("2 % 3的结果是："+ (2% 3));
        System.out.println("3 % 3的结果是："+ (3% 3));
        System.out.println("4 % 3的结果是："+ (4% 3));
        System.out.println("5 % 3的结果是："+ (5% 3));



    }
}
