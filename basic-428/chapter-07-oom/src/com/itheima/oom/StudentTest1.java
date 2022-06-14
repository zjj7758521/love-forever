package com.itheima.oom;

public class StudentTest1 {
    public static void main(String[] args) {

        //创建Student对象
        Student stu=new  Student();//⚠️⚠️注意大小写字母，new后面的要和"类名"一致；====》Student（类名）；stu（对象名）

        //测试：被private修饰的成员是否可以直接被访问（不可以访问）
        //stu.id=100;   运行结果提示id在该类中是被private访问控制。

        //：通过SStusent类提供的设置/获取成员的变量的set/get方法进行设置获取

        stu.setId(10);
        stu.setName("京京");//如果是String作为参数，直接传入字符传常量即可
        //set设置：stu.setId(10);✅
        //stu.setId();❌

        System.out.println("学生的学号是"+stu.getId());
        System.out.println("学生的姓名是："+stu.getName());
        //⚠️⚠️⚠️打印出来"用的是get"到的值，get方法在输出的时候写，不用像set似的另行一处代码，并且括号里写上内容

        //补充补充❌❌❌❌⚠️⚠️
        //设置：set▶️不要犯错：stu.getId(10);🙅❌////stu.setId();🙅❌


    }
}
