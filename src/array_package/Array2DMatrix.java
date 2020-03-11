package array_package;

import java.util.Scanner;

public class Array2DMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int [][] A = new int [2][3];
        //int [][] B =  new int [2][3];


        //Getting input for matrix     //Anisul Islam video 56
        for(int row = 0; row<2;row++){

            for(int colm = 0;colm<3; colm++){

                A [row][colm] = input.nextInt();

            }
        }

        //Getting A matrx
        System.out.println("A = ");
        for (int row = 0; row <2; row ++){

            for (int colm = 0; colm<3;colm ++){

                System.out.print("  "+A [row][colm]);
            }
            System.out.println();
        }
    }
}
