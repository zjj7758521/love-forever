package com.itheima.array;

public class ArrayDemo17 {
    public static void main(String[] args) {
        int[] arr=new int[1];

        //arr数组的长度为1，里面只能有1个元素，并且这个元素的索引值为0，没有其他的索引。
        //索引越界出现的原因：当使用不存在的索引去访问数组内容的时候，就会出现索引越界异常
        System.out.println(arr[1]);

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1   访问1索引越界了
        // java11对于数组越界异常的描述更清晰
        //解决方案：将访问不存在的索引修改为存在的索引，的确就是这样修改，不存在的索引再怎么改代码它也不存在，只能将索引修改为正确的区间
    }
}
