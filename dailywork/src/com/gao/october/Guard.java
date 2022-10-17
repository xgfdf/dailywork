package com.gao.october;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guard {
    static Scanner sc = new Scanner(System.in);


    //创建图书
    static ArrayList<Book> book1 =new ArrayList<>();

    public static void add(){


        int number  = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();

        Book books = new Book(sc.nextInt(),sc.next(), sc.nextDouble());

        book1.add(books);

    }


}
