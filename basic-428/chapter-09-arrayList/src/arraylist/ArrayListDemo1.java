package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //public ArrayList():创建一个内容为空的ArrayList集合
        //注意：ArrayList的无参构造，创建完成之后底层的数组默认可以存储10个元素
        //由于 ArrayList的特点让开发者不需要去担心底层数组的扩容操作，只需要使用就可以，但为了提高效率，要学习第二个构造方法

        //例如：构造一个可以保存String元素的ArrayList集合

        ArrayList<String> strlist =new ArrayList<>();

        //public ArrayList(int initalCapicty):创建一个内容为空的ArrayList集合，并且具有指定的容量（参数）
        //构造时传入的参数是多少，底层的数组默认就有多长
        ArrayList<String> strListTwo=new ArrayList<String> (100);//创建的strListTwo集合底层的数组初始化容量有100

        /*
        ArrayList的底层扩容的阈值0.75(当已有元素达到了数组的长度的75%的时候，就会触发扩容，每次扩容1.5倍）
        无参构造：数组（10）->(15)->(22)->(33)->(50)扩容是需要耗费时间的（创建新数组/移动老数组的内容）
        有参构造：数组（50）
        前提：当可以明确集合中要保存的元素的大致数量的时候，推荐使用有参构造（避免频繁触发扩容操作）=》提升代码的性能

         */



    }

}
