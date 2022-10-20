package com.gao.october._10_19.teacher;

import java.util.HashMap;
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
public class D19 {
    static Map<String,String> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(add(new User("Tom", "sdfwef")));


    }
    public static String add(User user){
        if (map.containsKey(user.getName())){
            return "添加失败，用户名已存在！";
        }
        if (user.getPwd().length()<6||user.getPwd().length()>12){
            return "密码必须在6~12位";
        }
        map.put(user.getName(), user.getPwd());
        return "添加成功";
    }
    public static String login(User user){
        String pass = map.get(user.getName());
        if (pass==null){
            return "用户名已，添加失败";
        }
        if (!pass.equals(user.getPwd())){
            return "密码错误";
        }
        return "登陆成功";
    }



}

class User{
    private String name;
    private String pwd;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

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
}
