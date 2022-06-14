package arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String>strList =new  ArrayList<>();
        //修改方法set
        strList.add("栈单 ");
        strList.add("栈单1 ");
        strList.add("栈2 ");
        strList.add("栈3 ");
        strList.add("栈4 ");

        //1.public E set(int index,E e):将指定index索引处的元素替换为参数元素e,并且将被替换的元素作为返回值返回 [了解 因为实际开发中基本不会用]
        //要修改集合的元素内容应该如何操作 => 不通过set方法,因为set方法太麻烦了.
        //⚠️⚠️例：将2索引转换为"你好"
        String replaceElament=strList.set(2, "你好");
        System.out.println("修改了2索引的结果是"+replaceElament);
        System.out.println("修改了2索引后集合的结果果是"+strList);

        //查询方法：获取指定元素处的索引
        String element0=strList.get(3);
        System.out.println("3索引处的内容是"+element0);








    }




}
