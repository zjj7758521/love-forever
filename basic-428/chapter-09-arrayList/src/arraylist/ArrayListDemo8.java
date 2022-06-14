package arraylist;

import com.itheima.Student;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        //最开始使用数组作为对象存储的容器存储了一些学生对象，案例：使用ArrayList来存储学生对象并遍历
        //使用集合存储学生对象和用数组存储学生对象的逻辑是一样的，使用数组通过索引来一个一个赋值，使用集合不需要那么麻烦，可以把每一个学生包含的多种信息放在一个集合内，几个学生就有几个集合

        //引入封装的学生信息（有参构造）
        Student stuOne=new Student("张三",18);
        Student stuTwo=new Student("李四",38);
        Student stuThree=new Student("王五",28);
        //♥️创建一个用于保存学生对象的集合类，保存字符串的时候泛型写的是<String>,保存学生对象的泛形写的是<Student>♥️
        ArrayList <Student> stu=new ArrayList<>();
        //通过结合对象调用方法将学生信息添加到集合中，使用的调用方法为add（e),默认添加元素到集合末尾
        stu.add(stuOne);
        stu.add(stuTwo);
        stu.add(stuThree);
        //(3)遍历集合打印每一个学生的信息
        for (int  i = 0;  i < stu.size();  i++) {
            Student ste=stu.get(i );
            //stu对应的是建立的集合的对象的名称,Stusdent类是我们自己定义的，所以stu.get(i )对应的是学生的地址值。⚠️String类可以用sout直接打印，因为是Java自己编写的，所以可以打印出来字符串内容而不是地址值
            // 因为stu.get(i )对应的是学生的地址值，所以接收到的不是学生真正的信息的内容，
            // 因此需要用一个可以在栈内中运行的变量来接收索引的每一个集合的元素，接下来通过show方法打印下来

            ste.show();//♥️⚠️这里是用变量Student类的变量ste来接收遍历集合的每一个元素



        }




    }
}
