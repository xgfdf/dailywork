package com.gao.reflection;

public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //创建Class类对象的方法
        //1、通过类名调用.class
        Class c = Man.class;

        //2、通过对象调用getClass()方法
        Man man = new Man();
        Class c2 = man.getClass();

        //根据完整包路径，获取Class对象
        Class c3 = Class.forName("com.gao.reflection.Man");
        System.out.println(c3.getName());

        System.out.println(c==c3);


    }
}
