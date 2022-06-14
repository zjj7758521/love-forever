package arraylist;


import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //  //增加/删除方法
        ArrayList <String> stralist=new ArrayList<>();
        stralist.add("一");
        stralist.add("二");
        stralist.add("三");
        stralist.add("四");
        stralist.add("五");
        stralist.add("六");
        stralist.add("七");

        //1.将要删除的元素作为参数传递，返回是否删除成功的结果：⚠️public boolean (object obj);♥️有变量接收哦
        //注意：要删除哪个元素就将哪个元素作为参数传递
        //注意：如果集合中有多个重复的元素，这个方法默认只删除符合要求的第一个=》如何删除多个重复的，后面讲解
        boolean resolutOne=stralist.remove("四");
        System.out.println("删除四之后的结果是"+resolutOne);
        System.out.println("删除四之后的集合的内容是"+stralist);

        boolean resolutTwo=stralist.remove("八");
        System.out.println("删除八之后的结果是"+resolutTwo);

        //2.删除指定索引的元素,并且将被删除的元素作为返回值返回.⚠️public E remove （int index)
        //思考:为什么这里不返回删除成功还是失败呢? 第一个方法之所以可以返回删除成功还是失败(删除的元素不能确定是否存在于集合中)
        //通过索引删除=>(1)一定删除成功,返回被删除的元素 (2)一定删除失败,如果索引不存在,索引越界,代码就直接停止了.
       String  removeElement=stralist.remove(4);
        System.out.println("删除4索引被删除的元素是"+removeElement);
        System.out.println("删除4索引之后集合的内容是是"+stralist);

        //♥️总结:如果一个元素被删除了,⚠️那么这个元素之后的内容会统一向前挪动一位⚠️.
        //♥️总结:两个方法都可以删除元素,虽然说参数不同,返回值也不同,但是相同点一次只能删除一个元素,如果元素重复(不能全部删除)




    }
}
