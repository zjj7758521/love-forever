package com.itheima.process;


import java.util.Scanner;

public class ForControlDemo1_2 {
    public static void main(String[] args) {

        //案例练习：逢n过n
        Scanner sc=new Scanner(System.in );
        System.out.println("请您输入一个数字：");
        int n = sc.nextInt();

        for (int i = 2; i >1&&i<100 ; i++) {


            if (i%n==0||i/10%10==n||i%10==n){
                System.out.println("过！");
                continue;
            }
            System.out.println(i);


        }
    }
}
