package com.itheima.string;

import com.itheima.entity.TargetStudent;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //需求：张三,北京,男,北京嘉利顿大学 => 真正的在使用的时候,需要将这个字符串转换为一个具体的学生对象之后再使用这个对象进行操作.
        //键盘按照以下格式录入信息后封装到学生对象=>姓名,籍贯,性别,学校名称

        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请您按照以下格式输入学生信息（姓名，籍贯，性别，学生名称）：");
        String infor = sc.nextLine();
        System.out.println("您录入的学生信息是"+infor);

        //2.分析切割标志符,录入的信息中各项信息是以,为分隔,可以将,作为切割标志.
        String[] inforArray=infor.split("，");

        //3..创建学生对象封装数据(数据从infoArray里面获取)
        TargetStudent student=new TargetStudent();
        student.setName(inforArray[0]);
        student.setAddress(inforArray[1]);
        student.setGender(inforArray[2]);
        student.setUniversity(inforArray[3]);

        student.show();






    }
}
