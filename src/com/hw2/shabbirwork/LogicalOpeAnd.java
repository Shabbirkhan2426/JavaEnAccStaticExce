package com.hw2.shabbirwork;

import java.util.Scanner;

public class LogicalOpeAnd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter one letter ");
        ch = input.next().charAt(0); // question

        if(ch>='a' && ch<='z'){

            System.out.println("small");

        }else if (ch >= 'A' && ch <= 'Z'){

            System.out.println("capital");
        } else{

            System.out.println("Not a letter");
        }

    }
}
