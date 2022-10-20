package com.gao.october;

import java.io.*;
import java.util.stream.Stream;

public class _10_18_ {
    public static void read_() throws IOException {
        File file1 = new File("E:\\code\\IO\\from.txt");


        InputStream in = new FileInputStream(file1);


        InputStreamReader reader = new InputStreamReader(in,"UTF-8");


        BufferedReader br = new BufferedReader(reader);

        int len = in.available();
        System.out.println(len);
        for (int i = 0; i < len/2; i++) {


        }


        int ss =br.read();
        System.out.println(ss);
        String str = br.readLine();
        while (str != null){
            System.out.println(str);

            str = br.readLine();
        }

    }

    public static void main(String[] args) {
        try {
            read_();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
