package com.hw2.shabbirwork;

import java.util.Scanner;

public class ArithmaticOpertor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numA, numB, result;

        //int numA = 20;
        //int numB = 10;

       
        System.out.print("Enter first number ");
        numA = input.nextInt();

        System.out.print("Enter secound number ");
        numB = input.nextInt();


         result = numA + numB ;
        System.out.println("Sum  ="+result);

        result = numA - numB ;
        System.out.println("Sum  ="+result);

         result = numA * numB ;
        System.out.println("Sum  ="+result);

         result = numA / numB ;
        System.out.println("Sum  ="+result);

        result = numA % numB ;
        System.out.println("Sum  ="+result);

    }
}