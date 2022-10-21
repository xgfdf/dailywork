package com.gao.reflection;

import java.lang.reflect.Field;

public class Field02 {
    public static void main(String[] args) {
        /*Field对象概述
            1）Java.lang.reflect.Field类是记录对象属性的类。
            2）可以操作类中私有，以及公有等全部属性和属性的信息.*/

        ////获取Man这个文件的class文件，用一个类记录这个信息
        Class c2 = Man02.class;

        //先给name属性赋一个值;
        Man02 man02 = new Man02();
        man02.setName("张三");

        try {
            //拿到这个name变量，
            Field field2 = c2.getDeclaredField("name");
            //启用/禁用访问控制权限，开启或关闭私有属性的访问权限
            field2.setAccessible(true);
            try {

                //获取man02类对象的 name变量的属性值
                //和之前是反着的，以前是，先对象，再通过对象调用变量
                //现在是先拿到变量的对象field2，通过变量对象的get()方法去获取指定类对象 的变量值
                String v = (String) field2.get(man02);
                System.out.println(v);

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }


        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
