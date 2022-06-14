package com.itheima.homework;

public class GirlfriendTest1 {
    //定义一个女朋友类
    public static void main(String[] args) {
        //创建女朋友对象
        Girlfriend muse=new Girlfriend();
        //方法一：空参构造创建对象,set方法赋值
        muse.setName("玛丽亚");
        muse.setHeight(165);
        muse.setWeight(130);
        muse.show();
        muse.wash();
        muse.cook();

        //方法二：满参构造直接创建对象
        Girlfriend museTwo=new Girlfriend("歌莉娅",170,98);
        museTwo.show();
        museTwo.wash();
        museTwo.cook();







    }
}
