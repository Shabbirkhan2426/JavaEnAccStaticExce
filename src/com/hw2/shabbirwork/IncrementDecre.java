package com.hw2.shabbirwork;

public class IncrementDecre {

    public static void main(String[] args) {

        int x = 25;
        int y;

         /*y = x ++; //post increment      Refer Anisu Islam video
        System.out.println("y = "+y);
         y = x;
        System.out.println("y = "+y);*/

         /*y = ++x; //pre increment x = 26
        System.out.println("y = "+y);
        y = x; ---question on this
        System.out.println("y = "+y);*/

         y = --x; //pre decrement x = 24
        System.out.println("y = "+y);

        y = x--;
        System.out.println("y = "+y);

        y = ++x; //pre increment x = 26
        System.out.println("y = "+y);

        y = x++;
        System.out.println("y = "+y);

    }
}
