package com.itheima.array;

import com.itheima.Student;

public class ObjectArrayDemo1 {
    public static void main(String[] args) {
        //有参构造:封装三个学生对象用于保存在数组中
        Student stuOne=new Student("张三",18);
        Student stuTwo=new Student("李四",38);
        Student stuThree=new Student("王五",28);

        //声明一个用于保存学生对象的数组
        //如何声明：⚠️学生对象数组[]前面的声明是什么呢？要保存的元素的数据类型是什么，就写什么=》要保存的元素的数据类型是引用数据类型，♥️引用数据类型的数据类型就是类名♥️
        //stuOne的数据类型就是Student/"张三的数据类型就是String;
        Student[] studentArray=new Student[3];

        //将要保存的元素保存到数组中，通过索引赋值
        studentArray[0]=stuOne;
       studentArray[1]=stuTwo;
       studentArray[2]=stuThree;

        //遍历数组，将学生信息打印到控制台
       for (int i = 0; i < studentArray.length; i++) {
            Student stu =studentArray[i];
            stu .show();



        }

    }
}
