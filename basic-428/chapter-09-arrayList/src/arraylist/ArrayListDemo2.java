package arraylist;


import java.util.ArrayList;

public class ArrayListDemo2{
    public static void main(String[] args) {
        //创建个组合元素
        ArrayList<String> strList=new ArrayList<>();
        //1.public boolean add(E e):添加元素到集合的末尾，返回值恒为true ,不对返回值进行接收（直接调用）
        //参数(E e)：E就是泛型，当创建了ArrayList集合确定<>中的数据类型的时候，E就会自动的变成指定的数据类型（作为限制）
        //1.默认添加元素到集合的末尾，返回值恒为true，不对返回值进行接收（直接调用）
        strList.add("玛丽亚");
        strList.add("个亚丽");
        strList.add("萨日数");

        //public void add(int index,E e）：添加元素到指定的索引，原索引和后面的元素全部向后挪动一位
        //2.添加到指定元素的索引，要添加的目标内容在所选择的元素的位置自动补上，例如⚠️：写2，要添加的就在1的后面，在索引2的位置；
        //⚠️⚠️注意：指定索引不能超过集合的长度（集合的长度为3，添加元素到0/1/2/3索引都可以），如果超过了集合的长度就会出现索引越界异常
        strList.add(2, "色调登");


        //补充：打印ArrayList集合对象可以直接打印处集合里面的内容，而不是地址值
        System.out.println("添加了4个元素之后，集合的内容是"+strList);
    }
}
