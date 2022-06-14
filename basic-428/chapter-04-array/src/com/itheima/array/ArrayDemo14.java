package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo14 {
    public static void main(String[] args) {
        //案例：评委打分———拆分写
        //模拟评委打分的分数，评委的个数由键盘录入决定，键盘录入每个评委的打分，要求输出平均分：（总分——最高分——最低分）/剩余的评委的数量
        Scanner sc =new Scanner(System.in);
        System.out.println("请您输入评委的个数");
        int count = sc.nextInt();
        int[] scoreArray=new int[count];

        for (int i=0;i<scoreArray.length;i++){
            System.out.println("请您输入第"+(i+1)+"个评委的分数");
           scoreArray[i] = sc.nextInt();
        }
        int scoreSum=0;
        for(int i=0;i <scoreArray.length;i++){
            scoreSum+=scoreArray[i];
        }

        int maxScore=scoreArray[0];
        for (int i = 1; i < scoreArray.length; i++) {
            if (scoreArray[i]>maxScore){
                maxScore=scoreArray[i];
            }

        }
        int minScore=scoreArray[0];
        for (int i =1;i< scoreArray.length ; i++) {
            if (scoreArray[i]<minScore){
                minScore=scoreArray[i];
            }

        }
        int avgScore=(scoreSum-maxScore-minScore)/(scoreArray.length/2);
        System.out.println("选手的总分数是"+scoreSum+"分，去掉一个最高分"+maxScore+"分，去掉一个最低分"+minScore+"分，选手最后的平均得分是"+avgScore);


    }
}
