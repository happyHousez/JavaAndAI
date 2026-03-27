package com.zujiale.test;
// package:表示当前的类定义在那个包下 ，IDEA自动添加的

/* 表示一个类
* public: 表示当前类是public的，public修饰符是访问权限修饰符，公共的访问权限修饰符
* class: 表示定义一个类，类名必须与文件名一致。类是JAVA的核心概念，类是程序的基本组成单元
* HelloWorld: 类名，类名必须大写开头，类名必须与文件名一致;
* {}: 类的主体，类中所有的成员变量，成员方法，构造方法，静态代码块，内部类，枚举，类定义，接口定义，注解定义
* */
public class HelloWorld {
    // 表示Java程序的入口方法,当程序开始运行时，会从主入口方法开始执行
    public static void main(String[] args) {
        //输出Hello World
        System.out.println("Hello World!");

    }
}
