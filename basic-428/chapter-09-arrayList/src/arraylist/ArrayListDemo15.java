package arraylist;

import com.itheima.Student;

import java.util.ArrayList;

public class ArrayListDemo15 {
    public static void main(String[] args) {
        //方法参数声明
        ArrayList<String> str=new ArrayList<>();
        str.add("关羽");
        str.add("赵云");
        str.add("刘备");
        str.add("刘备");
        str.add("张飞");
        str.add("黄忠");
        str.add("刘备");
        str.add("刘备");
        str.add("马超");

         show (str);// ⚠️♥️ArrayList作为参数，show作为方法名⚠️♥️
        ArrayList<Student> list = createList();//⚠️♥️ArrayList作为参数方法返回值类型，createList为方法名；⚠️♥️


    }



    /*
    ArrayList作为♥️方法参数♥️,应该如何进行声明? => 学习方法的时候()里面是参数列表,方法需要什么类型的参数,就将参数的数据类型 变量名声明()中.
    想要传递str => 数据类型:ArrayList => 注意事项:在声明方法的参数的时候,如果参数是ArrayList,推荐加上泛型(限制)
     */

    private static void show(ArrayList<String> str) {

    }



    /*
   ArrayList作为♥️方法返回值♥️,应该如何进行声明? => 学习方法的时候,如果方法执行完毕有需要返回给调用者的数据,在返回值类型的地方声明返回数据的数据类型.
   想要返回stu => 数据类型:ArrayList => 注意事项:在声明方法的返回值类型的时候,如果参数是ArrayList,推荐加上泛型(方便调用者进行接收)
    */
    private static ArrayList<Student> createList() {
        ArrayList<Student> stu=new ArrayList<>();
        return stu;

    }
}
