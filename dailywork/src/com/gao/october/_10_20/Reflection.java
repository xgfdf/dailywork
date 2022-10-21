package com.gao.october._10_20;

/*
public class Man {
   private String name ;
}
Man m = new Man();
m. setName("刘能" );
1请使用反射的方式，修改m对象的name变量值为"谢广坤"
2请使用反射的方式，创建一个新的Man类的对象
* */

import java.lang.reflect.Field;

//下面我写的还是不符合要求，要求使用反射的方式，修改变量值
public class Reflection {
    public static void main(String[] args) {

        /*Man m = new Man();
        m.setName("刘能");

        Class c = Man.class;
        try {
            Man man = (Man) c.newInstance();
            man.setName("谢广坤");
            System.out.println(man.getName());

            Man man1 = (Man) c.newInstance();



        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
*/

        Man m = new Man();
        m.setName("刘能");
        Class c = Man.class;
        try {
            Field field = c.getDeclaredField("name");
            field.setAccessible(true);
            try {
                field.set(m,"谢广坤");

                try {
                    //2请使用反射的方式，创建一个新的Man类的对象
                    Man man1 = (Man) c.newInstance();
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }


        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
