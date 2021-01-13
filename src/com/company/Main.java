package com.company;

public class Main {

    public static void main(String[] args) {

//        for (int i = 100; i >0; i = i-5) {
//            System.out.println(i);
//        }
        for (int i = 0; i <=100; i = i+=10) {
            System.out.println(i);
            if (i%20 ==0 && i!=0){
                System.out.println("Java");

            }
        }

    }
}
