package com.gao.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {

        //Man man = new Man();

        //Class类表示的是一个类的.class文件
        Class c = Man.class;//获取Man这个文件的class文件，用一个类记录这个信息
        //c是Man的class文件


        try {
            //创建该类的对象,加一个强转
            Man man = (Man) c.newInstance();//返回的是Object引用



            //验证是否创建成功
            man.setAge(10);
            System.out.println(man.getAge());

            //2、获取类中的指定变量
            c.getDeclaredField("name");

            //3、获取类中的指定变量，不包括私有
            c.getField("name");

            //获取类中所有变量，返回Field类型数组
            Field[] fs = c.getDeclaredFields();
            for (Field f:fs) {
                System.out.println(f.getType());
            }

            //根据指定方法名和指定的参数列表,获取方法对象
            // getMethod( @NonNls  @NotNull  String name, Class<?>... parameterTypes )
            //name方法名;
            //parameterTypes 参数列表的数据类型
            Method mt = c.getDeclaredMethod("speak",null);
            //Method是个类，翻译为方法，所以叫获取方法对象

            Method mt2 = c.getDeclaredMethod("speak", String.class, int.class);


        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
