package com.itheima.process;

public class ForControlDemo1 {
    /*
    循环控制：在循环的执行过程中可以对循环进行控制的两个关键字，（直接使用）⚠️⚠️

    continue（继续）：比如暂停了游戏之后，点击continue继续游戏

    ⚠️⚠️⚠️只可以在循环中使用，作用功能：跳过本次循环（continue后面的代码不执行），继续下次循环（直接到步进表达式）。
    continue的使用方式⚠️：搭配判断，如果满足了某种情况，不需要向下继续执行的时候，可以使用continue，如不搭配判断，直接使用continue无意义
    参考逢7过案例（如果和7有关，直接过，从下一个数开始循环，本次跳过

    ⚠️⚠️⚠️不使用continue，使用if。。。else也能达到一样的效果，continue不强制使用（如果if。。。else看的更加的明白），一般情况下continue
    和if。。。else可以等价互换！
     */



    public static void main(String[] args) {

        //逢7过的案例，1-100之间的范围
        for (int i = 1; i <=100; i++) {
            if (i%7==0||i/10%10==7||i%10==7){
                System.out.println("过！");
                continue;//当满足这个条件，说完过之后，跳过本次循环（continue后面的代码就不执行了），继续下次循环
            }
            System.out.println(i);//不满足这个条件的时候直接打印i就可以了

        }



    }




}

