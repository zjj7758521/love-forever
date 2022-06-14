package com.itheima.oom;

public class UserTset1 {
    public static void main(String[] args) {
        User userOne=new User();//无参构造，创建user对象userOne

        //getAndset方法
        //通过SET方法赋值之后模拟登陆与登出
        userOne.setUsername("京京");
        userOne.setPassword("zjj1234567");
        userOne.setEmail("jinbgjing@itcast.com");
        userOne.setGender('女');
        userOne.setAge(28);

        //仍需说明❌❌❌
        //输出需要用out
        //注意⚠️⚠️⚠️格式：对象名.方法名（）；调用方法✅
        userOne.userLogin();
        System.out.println("用户"+userOne.getUsername()+"登陆到了系统之后，完成了今天的创造");
        userOne.ueernameLogout();


        //仍需说明❌❌❌//有参构造
        //通过有参构造创建user对象再模拟登陆与登出

        User userTwo=new User("嘻嘻", "zjj1234567", "jingjing@itcast.com", '女', 28);
        userTwo.userLogin();
        System.out.println("用户"+userTwo.getUsername()+"登陆到了系统之后，完成了今天的创造");
        userTwo.ueernameLogout();
        //⚠️⚠️⚠️调用对象注意方法和前面的java.bean文件创建的方法名称保持一致：userTwo.userLogin();//userTwo.ueernameLogout();🙅‍其实这里单词不小心写错了才发现的易出错问题，哈哈哈哈哈





    }
}
