package com.itheima.oom;

public class Student {


    //成员变量（不让外界直接通过 {对象名.属性名} 的方式访问,保证数据安全，先私有化用private修饰。
    private int id;
    private String name;


    //私有化之后对外提供设置属性的Set方法以及获取属性GET方法
    public void setId(int i){

        //判断传入的值是否合法
        /*if (i>0){
            id=i;
        }else{
            System.out.println("给学生赋值非法！" );
        }
        */

        this.id=id;
        //this.变量名  ==》默认访问的就是成员变量
        //this的作用就是当局部变量和成员变量重名的时候，使用this，属性名就是表示成员变量，不加this，默认访问的就是局部变量（就近原则）


}
public int getId(){
        return id;//将id的值作为方法的返回值返回；
    }

    public void setName(String s){
        //name=s;//字符传s赋值给name,之后在get处返回得到===>随着以上使用if产生的后续代码是用这个，换成this的用法了，暂停使用此处赋值
        this.name=name;
    }

    public String getName(){
        return name;
    }

}

