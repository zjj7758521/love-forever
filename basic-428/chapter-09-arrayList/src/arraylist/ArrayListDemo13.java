package arraylist;

import java.util.ArrayList;

public class ArrayListDemo13 {
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
        //⚠️⚠️⚠️♥️♥️解决方案一:解决索引跳过的问题(当if判断成功,元素删除掉之后,将i索引先--,和步进表达式的++抵消掉)
        for (int i = 0; i < str.size(); i++) {
            String name=str.get(i);
            if (name.equals("刘备")){
                str.remove(i);
                i--;
            }


        }
        System.out.println("删除了刘备之后,集合的内容是:" + str);



    }
}
