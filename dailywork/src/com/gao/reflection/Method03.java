package com.gao.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Method03 {
     public static void main(String[] args) {


          Class c3 = Method03.class;

          Man03 man03 = new Man03();
          try {

               //获取方法对象
               //参数列表位空，null
               Method m3 = c3.getDeclaredMethod("speak",null);

                //调用方法
               try {
                    //null表示没有值
                    m3.invoke(man03,null);

                    Method  m4 = c3.getDeclaredMethod("speak",String.class,int.class);
                    m4.invoke(man03,"sdfsad",12);


               } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
               } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
               }

          } catch (NoSuchMethodException e) {
               throw new RuntimeException(e);
          }

     }


}
