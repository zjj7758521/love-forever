package com.itheima;

public class Student {
    //(1)
    private String name;
    private int age;
    //(2)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //

    public Student() {
    }
    //

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //
  public void show()
  {
      System.out.println("这个学生的姓名是："+name+",年龄是："+age+"岁！");
  }


}
