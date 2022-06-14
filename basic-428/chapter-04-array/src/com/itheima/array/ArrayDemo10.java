package com.itheima.array;

public class ArrayDemo10 {
    public static void main(String[] args) {
        //案例：数组元素求和
        int[] intArray={100,200,300,400};

        //求和思想：预先声明一个变量用于保存数组中所有元素的累加求和
        int elementSum=0;

        //遍历数组：通过i索引获取数组中的每一个元素和 elementSum累加即可
        for (int i=0;i<intArray.length;i++){
            elementSum +=intArray[i ];//elementSum=elementSum+intArray[i ]

        }
        System.out.println("数组中所有元素的和是："+elementSum);
    }
}
