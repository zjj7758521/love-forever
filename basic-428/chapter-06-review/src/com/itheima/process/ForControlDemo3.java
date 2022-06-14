package com.itheima.process;

import java.util.Scanner;

public class ForControlDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //不能确定录入几次就可以录入一个符合要求的数据=》每次都要录入，都要进行判断（循环）==》不明确循环次数（死循环）
        while(true){
            System.out.println("请您输入一个符合要求的数字（25——50）！");
            int i = sc.nextInt();
            if(i>=25&&i<=50){
                System.out.println("您输入的数字"+i+"符合要求！");
                break;
            }
            else{
                System.out.println("您输入的数字"+i+"不符合要求！");
            }
        }
    }
}
