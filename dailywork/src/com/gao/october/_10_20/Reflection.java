package com.gao.october._10_20;



public class Reflection {
    public static void main(String[] args) {

        Man m = new Man();
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


    }
}
