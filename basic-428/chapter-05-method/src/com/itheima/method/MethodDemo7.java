package com.itheima.method;

public class MethodDemo7 {
    public static void main(String[] args) {

        int[] arr={10,12,34,56,34};
        int number=56;
        int getElementNumber=getElement(arr,number);
        System.out.println("目标值number"+number+"在数组中的索引是："+getElementNumber);

    }

    //卫函数：减少程序复杂度提前返回输出的一种函数，如果方法执行的过程中，出现了可以直接返回结果不需要再向下执行的情况，直接返回，下面不执行
    //卫函数在之后的开发中出现的频率是非常高的，因为可以有效提高方法的运行效率=》注意⚠️⚠️⚠️：要有保底返回值
    //案例，定义一个方法，方法需要一个int[] 数组作为参数，还需要一个int类型的数字作为参数，返回数字在数组中第一次出现索引值，若没有则返回-1.

    /*
    方法定义的三要素：
    分析（1）：方法的参数列表，方法定义出来到底是需要哪些未知的数据，提前的进行声明。(int[] arr,int number)
    分析（2）：方法的返回值类型 方法运行完成之后数否需要返回内容给调用者 int
    分析（3）：方法的名称 getElementIndex 获取元素索引
     */
    public static int getElement(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                return i ;
            }

        }
        return -1;
    }
}
