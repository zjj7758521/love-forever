package arraylist;

import java.util.ArrayList;

public class ArrayListDemo14 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        //案例:ArrayList删除多个重复元素的问题
        //前提:ArrayList的remove方法的时候学习了两种(调用一次只能删除一个元素) 如果有多个重复的元素不能通过调用一次remove方法就删除完的.

        str.add("关羽");
        str.add("赵云");
        str.add("刘备");
        str.add("刘备");
        str.add("张飞");
        str.add("黄忠");
        str.add("刘备");
        str.add("刘备");
        str.add("马超");

        //删除集合中所有的刘备元素(核心思想:遍历集合获取元素判断是不是刘备,如果是就删除)
        //⚠️⚠️⚠️♥️解决方案二:倒序遍历(从后往前进行元素的获取,删除,不需要再对索引进行任何操作了)，因为每删除一个往前移动一个
        for (int i = str.size() - 1; i >= 0; i--) {
            String name=str.get(i);
            if (name.equals("刘备")){
                str.remove(i);
            }
        }
        System.out.println("删除了刘备之后,集合的内容是:" + str);

    }
}
