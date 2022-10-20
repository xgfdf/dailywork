package com.gao.october;

import java.io.*;

/*
* *  已知from.txt文件中有这样的一个字符串：“abcd1234”
 *  请编写程序读取数据内容，分两行（每四个字符换一行）写入到to.txt中
* */
public class _10_18 {

    public static void copyFile() throws IOException {
        InputStream in  = new FileInputStream(new File("E:\\code\\IO\\from.txt"));
        OutputStream out = new FileOutputStream(new File("E:\\code\\IO\\to.txt"));

       /* OutputStream outputStream =null;
        OutputStreamWriter writer = null;
        BufferedWriter bw = null;

        String FileOutputStream = null;
        outputStream  = new FileOutputStream(FileOutputStream);
        writer = new OutputStreamWriter(outputStream,"UTF-8");
        bw = new BufferedWriter(writer);
*/
        int size = in.available();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            if (i == 4){
                out.write(10);
            }

            out.write(in.read());

        }
       /* bw.newLine();
        for (int i = size/2; i < size; i++) {

            out.write(in.read());

        }*/
        /*BufferedWriter bw = null;
        byte[] bytes = new byte[4];
        int len = in.read(bytes);
        while (len!=-1){
            out.write(bytes);
            System.out.println("\n");
            len = in.read(bytes);

        }*/




        out.close();
        in.close();

    }

    public static void main(String[] args) {
        try {
            copyFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
