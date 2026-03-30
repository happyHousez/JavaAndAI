package com.zujiale.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //类型转换：自动类型和强制转换

        // 自动类型转换
        int a = 10;
        double b = a;
        System.out.println(b);

        // 强制转换
        double c = 10.5;
        int d = (int)c;
        System.out.println("强制转换后的结果为：" + d);

//        报错，因为3.4默认是双精度，需要强制转换
//        float f=3.4;
          float f=(float)3.4;
        System.out.println("强制转换后的结果为：" + f);

        short s1=1;
//        因为1是int类型，s1+1是int型，需要强制转换才能给short
//        s1=s1+1;
        s1+=1;  //s1=(short(s1+1))
        System.out.println("强制转换后的结果为：" + s1);
        System.out.println("------------------");
/*
* 装箱和拆箱
* */
        Integer i=10;
        int n=i;
        System.out.println("拆箱后的结果为：" + n);
        System.out.println("装箱后的结果为：" + i);
        System.out.println("------------------");

        /*
        * &和&&的区别
        * */
        // &：位运算符
        int a1=10;
        int b1=20;
        // &:位运算符  &
        System.out.println(a1&b1);
        System.out.println(a1|b1);
        System.out.println(a1^b1);
        System.out.println(~a1);
        System.out.println(a1<<2);
        System.out.println("______________________");

        // ++  --
        int t = 1;
        int temp = t;
        System.out.println(  t);
        t++;
        System.out.println(t);
        t = temp;
        System.out.println(t);

        int count = 0;
        for(int e = 0;e < 100;e++)
        {
            count = count++;

        }

        System.out.println("count = "+count);
    }
}
