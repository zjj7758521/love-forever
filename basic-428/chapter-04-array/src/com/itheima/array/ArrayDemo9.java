package com.itheima.array;

public class ArrayDemo9 {
    public static void main(String[] args) {
        //数组通用的遍历格式：for（int i=0;i<数组名.length;i++）{数组名[i]}
        //以上通用的遍历格式用于遍历任何数组都是可以的

        int[] intArray={2,3,4,5,6};

        //（1）正序遍历：从一个元素开始一直获取到最后一个   快捷方式：数组名.fori
        for(int i=0;i<intArray.length;i++){

        }

        //（2）倒序遍历：从最后一个元素开始一直获取到第一个   快捷方式：数组名.forr
        for (int i = intArray.length - 1; i >= 0; i--) {

        }


        //(3)简单补充：数组名.for也可以生成一种格式
        //会将数组中的每一个元素赋给i，本质上叫做增强For循环（就业班讲解的内容），忽略掉了索引的概念
        for(int i:intArray){

        }

    }
    }

