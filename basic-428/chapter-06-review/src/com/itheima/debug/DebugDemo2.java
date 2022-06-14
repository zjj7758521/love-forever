package com.itheima.debug;

public class DebugDemo2 {
    public static void main(String[] args) {
        int[] arr={100,300,500};
        System.out.println("调用chang方法前，arr数组的0索引内容是"+arr[0]);
        System.out.println("调用chang方法前，arr数组的1索引内容是"+arr[1]);
        System.out.println("调用chang方法前，arr数组的2索引内容是"+arr[2]);
        change(arr);
        System.out.println("调用chang方法后，arr数组的0索引内容是"+arr[0]);
        System.out.println("调用chang方法后，arr数组的1索引内容是"+arr[1]);
        System.out.println("调用chang方法后，arr数组的2索引内容是"+arr[2]);

    }

    //方法参数传递引用数据类型
    public static void change(int[] arr){
        //当方法运行之后，将传递进来的number的数值改为200.
        arr[0]=200;
        System.out.println("()方法的number的值是："+arr[0]);


    }
    //结论：⚠️⚠️⚠️方法参数传递"引用数据类型"，方法调用之后形参改变，实际参数也会改变
}
