package com.itheima.oom;

public class GirlFriendTest1 {
    public static void main(String[] args) {
        //创建GirlFriend的对象"muse"
        GirlFriend muse=new GirlFriend();

        muse.name="溪溪";
        muse. height=1.72;
        muse.weight =45;
        muse.money =999999999999.9;

        System.out.println("女朋友"+ muse.name);
        System.out.println("女朋友"+muse. height);
        System.out.println("女朋友"+muse.weight);
        System.out.println("女朋友"+muse.money);


        //调用格式：对象名.方法名（）;
        muse.shopping(999999999999.9);
        muse.sleep();
        muse.watchingTV();
        //此处用对象名，不是类名⚠️⚠️⚠️muse







    }
}
