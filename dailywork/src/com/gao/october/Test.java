package com.gao.october;
public class Test {
    public static void main(String[] args) {

        Man man1 = new Kid();
        Kid kid = (Kid) man1;
    }
}
class Man{

}
class Kid extends Man{
}
