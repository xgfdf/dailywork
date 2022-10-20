package com.gao.october._10_19;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/*使用Map集合作为存储结构，模拟用户注册与登录。
用户类属性:用户名、密码。
要求如下:
    1用户名不能重复
    2密码长度不能小于6位且不能大于12位
    3登录验证需要判断用户名与密码是否一致
    4业务方法
        方法一:登录验证()
              如果用户名和密码全都正确，提示登录成功;
              如果用户名错误，提示登录失败，用户名不存在;
              如果密码错误，提示登录失败，密码错误。
        方法二:添加用户()
              判断用户名是否重复，如果重复返回添加失败
              判断密码是否规范，如果长度小于6或者大于12,返回密码不符合规则 */
public class User {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public static void sin_in() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要添加的用户名");
        String name = scanner.next();

        Map<String, String> map = new HashMap<>();
        //判断用户名是否重复
        if (map.containsKey(name)) {
            System.out.println("用户名已存在！");
        }
        System.out.println("输入密码");
        String pwd = scanner.next();
        map.put(name, pwd);
        System.out.println(map);
        System.out.println(map.size());

    }

    public static void login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的用户名：");
        String name = sc.nextLine();

        /*if (map.containsKey(userName)) {
            System.out.println("请输入您的密码：");
            String pwd= sc.nextLine();
    }*/
    }
}
