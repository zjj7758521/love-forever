package com.itheima.oom;

public class User {

    //1.定义user类的成员变量

    private  String username;
    private  String password;
    private  String email;
    private  char gender;
    private  int age;

    //2.针对于私有的成员变量对外提供公共的Get/Set方法
    // 快捷键control+n-->GetterAndSetter-->自动生成set/get方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }


    //3.生成有参构造/无参构造方法
    //快捷键control+n-->Constructor--->先none（空参）再全部选择建立（满参
    public User(String username, String password, String email, char gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //4.编写用户登陆的方法
    public void userLogin(){
        System.out.println("用户名为："+username+",密码为："+password +"的用户登陆到了系统中");
    }

    //5.编写用户退出登陆的方法
    public void ueernameLogout(){
        System.out.println("用户名为："+username+"的用户退出了系统");
    }
}
