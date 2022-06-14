package arraylist;

import com.itheima.Student;

import java.util.ArrayList;

public class ArrayListDemo11 {
    public static void main(String[] args) {
        //封装三个学生对象用于保存在集合中（有参构造）
        Student stuOne=new Student("张三",18);
        Student stuTwo=new Student("李四",38);
        Student stuThree=new Student("王五",28);

        //创建一个用于保存学生对象的集合类，保存字符串的时候泛型写的是<String>,保存学生对象的泛形写的是<Student>
        ArrayList<Student> stu=new ArrayList<>();

        //通过结合对象调用方法将学生信息添加到集合中，使用的调用方法为add（e),默认添加元素到集合末尾
        stu.add(stuOne);
        stu.add(stuTwo);
        stu.add(stuThree);


        //模拟:studentList是调用某个方法得到的一个ArrayList并不是你自己创建的,集合里面保存的Student对象.
        //要求:如果保存的学生对象的姓名是李四,则把年龄修改为24岁.
        //目的:让同学们能够明确之后如果想要修改集合中的对象的数据内容,应该如何去做(非常简单)
        //⚠️♥️推荐的方式:当本次获取到的元素就是要修改的元素的时候,♥️直接通过元素对象调用set方法直接赋一个新的值.♥️


        //遍历集合，打印每一个元素
        for (int i = 0; i < stu.size(); i++) {
            Student str=stu.get(i);
            if("李四".equals(str.getName())){
                str.setAge(24);//直接通过本次获取到的str调用set方法就可以啦
                str.show();

            }
        }

    }
}
