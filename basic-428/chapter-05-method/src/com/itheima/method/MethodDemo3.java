package com.itheima.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        //调用带有参数的方法的格式：⚠️⚠️⚠️方法名（参数）；如果有多个参数，按照顺序，类型使用，分割之后传递
        //如果方法声明的参数则必须传递，必须按照顺序，类型一一进行传递
        sum(20, 30);//⚠️⚠️⚠️注意：如果你传递的参数是常量，直接输入常量（比如这里：直接输入数字）即可，那么会在常量的前面加上实际传递给的参数的名称，这个是idea自加的，不需要手动写
        int numberOne =30,numberTwo=40;
        sum(numberOne,numberTwo);

    }


    //分析：在sum方法中要求2个值的和，但是这2个数据不知道是什么，对于不能确定具体内容的数据声明为方法的参数
    //方法名（）中的内容叫做参数列表，参数列表(int a,int b)
    public static void sum(int a,int b){
        //在方法中可以直接使用a和b=》预先的在方法中使用声明的参数
        System.out.println("a和b的值是："+(a+b ) );
    }
}
