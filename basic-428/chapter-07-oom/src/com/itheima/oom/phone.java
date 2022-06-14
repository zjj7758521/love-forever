package com.itheima.oom;

//定义：手机类
//手机类并没有和之前一样定义main方法，当前类是用于描述一类事物的共同特征而存在，并不是为了运行而存在
//这种里面不要写main方法==》否则破坏了这个类原本的含义


public class phone {
    //属性：成员变量（所有手机都具备的属性）定义格式⚠️⚠️⚠️：数据类型 成员变量名称；
    String brand;
    double price;





    //方法：成员方法（所有手机都具备的行为）定义格式：之前定义方法的格式（去掉static关键字，其他的该有的参数就声明参数，该有返回值就声明返回值）
    // 定义格式⚠️⚠️⚠️：public void call（行为名）()
    public void call(){
        System.out.println("手机可以拨打电话！");
    }

    public void sendMessage(){
        System.out.println("手机是可以发短信的！");
    }
    public void playGame(){
        System.out.println("手机可以玩王者荣耀");
    }


}
