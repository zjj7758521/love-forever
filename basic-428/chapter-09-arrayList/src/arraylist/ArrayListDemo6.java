package arraylist;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        //♥️♥️方法的使用：获取长度，是否包含指定元素，清除元素，判断是是否为空集合
        ArrayList<String> strlist=new ArrayList<>();
        strlist.add("张飞");
        strlist.add("关羽");
        strlist.add("赵云");
        strlist.add("马超");
        strlist.add("黄忠");
        strlist.add("诸葛亮");


        //（1）size：获取集合中的长度   ️⚠️⚠️public int size() :
        //注意:ArrayList底层是数组,这个方法获取是当前集合中有效元素的个数,而不是底层数组的长度.
        int  size  = strlist.size();
        System.out.println("集合元素的有效个数为："+size+"个。");

        //♥️/*几种的长度的获取:(1)获取数组的长度(属性) 数组名.length (2)获取字符串的长度(方法) 字符串对象.length() (3)获取集合的长度(方法) 集合对象.size()*/♥️

        //（2）contains判断集合中是否包含指定的元素,如果包含就返回true,不包含就返回false.   ⚠️⚠️public boolean contains(Object o) :
        boolean resultOne = strlist.contains("关羽");
        System.out.println("集合中是否包含关羽元素"+resultOne);
        boolean resultTtwo = strlist.contains("刘备");
        System.out.println("集合中是否包含刘备元素"+resultTtwo);

        //（3）clear：清空集合中的所有元素    ⚠️⚠️public void clear()
        strlist.clear();
        System.out.println("清空元素后，集合的长度为："+strlist.size());//⚠️如果没有赋值新的变量接收，要写的是+strlist.size()

        //(4)isEmpt  判断集合是否为一个空集合(空集合指的没有任何元素的集合) true:是空集合 false:不是空集合⚠️⚠️4.public boolean isEmpty()
        boolean resultThree = strlist.isEmpty();
        System.out.println("集合是否为空集合："+resultThree);//⚠️如果没有赋值新的变量接收，要写的是+strlist.isEmpty()，♥️有变量接收，写接收的变量结果的名称就可以


    }

}
