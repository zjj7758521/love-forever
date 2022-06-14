package com.itheima.string;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.同学在切割字符串的时候容易犯错的是中文符号英文符号区分不清楚.
        //字符串中的符号是英文符号,切割的时候就按照英文符号切割,字符串中是中文符号,就按照中文符号切割.
        String str = "张三,男,北京";
        String[] splitResultArray = str.split("，");

        //补充:可以按照任何切割标志切分,空格都行(空格也有中文和英文的区别) => "张三 男 北京".split(" ");√

        //2.切割标志符号直接写特殊符号无法切割的问题,这些特殊符号其实都是在Java里面有特定含义的符号.
        //注意:不需要去背这些⚠️【特殊符号】有哪些,尽量避免 => ♥️♥️如果不能避免,在传递切割标志符参数的时候,❤️在符号的前面加上\\,转义字符.❤️
        String strTwo = "张三|男|北京";  //中间用|符号分隔.
        String[] splitResultArrayTwo = strTwo.split("\\|");


    }
}
