package arraylist;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        //方法：获取/查询方法：get
        ArrayList <String> strList = new ArrayList<>();

        strList.add("刘备");
        strList.add("张飞");
        strList.add("关羽");
        strList.add("赵云");
        strList.add("马超");
        strList.add("黄忠");
        strList.add("诸葛亮");
        strList.add("许褚");

        //1.public E get(int index) : 获取指定索引处的元素.
        String element0 = strList.get(0);
        String element3 = strList.get(3);
        String element6 = strList.get(6);

        System.out.println("0索引的内容是:" + element0);
        System.out.println("3索引的内容是:" + element3);
        System.out.println("6索引的内容是:" + element6);



    }
}
