package arraylist;

import java.util.ArrayList;

public class ArrayListDemo12 {
    public static void main(String[] args) {
        //案例:ArrayList删除多
        // 多个重复元素的问题
        //前提:ArrayList的remove方法的时候学习了两种(调用一次只能删除一个元素) 如果有多个重复的元素不能通过调用一次remove方法就删除完的.
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

        //删除集合中所有的刘备元素(核心思想:遍历集合获取元素判断是不是刘备,如果是就删除)
        for (int i = 0; i < str.size(); i++) {
            String name=str.get(i);
            if (name.equals("刘备")){
                str.remove(i);//通过remove方法删除索引i的元素
            }

        }
        System.out.println("删除了刘备之后,集合的内容是:"+str);




    }
}
