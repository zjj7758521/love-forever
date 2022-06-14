package arraylist;

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList <String> starlist=new  ArrayList<>();
        starlist.add("张飞");
        starlist.add("关羽");
        starlist.add("赵云");
        starlist.add("马超");
        starlist.add("黄忠");
        starlist.add("诸葛亮");

        //案例:完成对strList集合的遍历,打印集合中的每一个元素.
        for (int i = 0; i < starlist.size(); i++) {
            String name=starlist.get(i );
            //⚠️这里用的是starlist.get(i )方法遍历♥️这里是集合元素，不是数组元素，所以一个是用获取的方法 ⚠️集合名.get（i）来获取，一个是数组名[i]⚠️
            System.out.println("本次遍历集合的元素是："+name);


            //分析(1):其实和遍历数组是一样,集合中也有索引的概念,第一个元素是0索引,最后一个元素的索引是集合的长度-1⚠️【(集合.size()-1)】⚠️,定义一个值,从0开始到最后一个索引结束.
            // 分析(2):通过i作为变换的索引,可以去访问集合中的元素=>获取集合中指定索引元素的方法public E get(int index),⚠️让集合对象调用get方法将索引i传递进去即可获取每一个元素⚠️.


        }


    }
}
