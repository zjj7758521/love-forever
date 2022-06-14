package arraylist;


import com.itheima.Student;

import java.util.ArrayList;

public class ArrayListDemo10 {
    public static void main(String[] args) {
        //有参构造学生信息：封装三个学生对象用于保存在集合中
        Student stuOne=new Student("张三",18);
        Student stuTwo=new Student("李四",38);
        Student stuThree=new Student("王五",28);

        //创建一个用于保存学生对象的集合类，保存字符串的时候泛型写的是<String>,保存学生对象的泛形写的是<Student>
        ArrayList<Student> stu=new ArrayList<>();

        //通过结合对象调用方法将学生信息添加到集合中，使用的调用方法为add（e),默认添加元素到集合末尾
        stu.add(stuOne);
        stu.add(stuTwo);
        stu.add(stuThree);


        //模拟:stu是调用某个方法得到的一个ArrayList并不是你自己创建的,集合里面保存的Student对象.
        //要求:如果保存的学生对象的姓名是李四,则把年龄修改为24岁.
        //目的:让同学们能够明确之后如果想要修改集合中的对象的数据内容,应该如何去做(非常简单)

        //(3)遍历集合打印每一个学生的信息
        //不推荐的方式⚠️⚠️♥️用集合的set方法完成元素的替换 [不推荐:重新封装一个对象的代价过高]
        for (int i = 0; i < stu.size(); i++) {
            Student str=stu.get(i);//遍历获取每一个学生的信息，用于以下的判断
            if("李四".equals(str.getName()) ){
               //重新封装一个对象然后替换掉当前索引i的学生对象⚠️♥️：重新封装的概念可以理解为重新构造一个学生的相关信息
                Student srs=new Student(str.getName(),24);//getName():涉及到的知识点为set/get方法
                stu .set(i , srs);
                srs.show();

            }
        }


    }
}
