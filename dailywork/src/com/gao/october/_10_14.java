package com.gao.october;

public class _10_14 {
    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println("面积是："+area.calArea());

        f5();


    }
    //输入一个浮点数f, 表示华氏温度, 输出对应的摄氏温度c , c=5/9*(f-32)
    public static double f2(double n2){
        double c = 5/9*(n2-32);
        return c;


    }
    //张三学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。
    //	 * 电梯每次可以乘坐12人，每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。
    //	 * 请帮助张三计算还需要多少分钟才能乘电梯到达楼上。（假设最初电梯在1层）
    public static int f4(int n){
        int perP = 12;
        int up = 2, down = 2;
        int time;
        time = (n/12*4)+2;
        return time;

    }
    //有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    public static void f5(){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i!=j&&i!=k&&j!=k){
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.println();
                    }

                }


            }

        }

    }







}

class Area{

    private double radius;
    public final double P = 3.14;

    public Area(double radius) {
        this.radius = radius;

    }
    public double calArea(){
        return P*radius*radius;
    }
}
