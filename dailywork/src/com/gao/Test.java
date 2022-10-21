package com.gao;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String number ="12:39:41" ;

        String regx = "\\d\\d[:]\\d\\d[:]\\d\\d";

        boolean tar = Pattern.matches(regx,number);
        System.out.println(tar);
    }
}
