package array_package;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        //finding Sum and Average number of array    //Anisul Islam video

         Scanner input = new Scanner(System.in);
         double []number = new double[5];
         double sum = 0;

         System.out.print("Please Enter 5 numbers  :");

         /*number [0] = input.nextDouble();
         number [1] = input.nextDouble();
         number [2] = input.nextDouble();
         number [3] = input.nextDouble();
         number [4] = input.nextDouble();*/

         //To get the input
         for (int i = 0;i<5;i++){
             number [i]= input.nextDouble();

            //Below for loop example to understand how to get the sum result
             /*number [0]=1;
             number [1]=2;
             number [2]=3;
             number [3]=4;
             number [4]=5;*/
         }

         for(int i = 0;i<5;i++){
             sum = sum + number[i];
         }

         //sum = number [0] + number [1] + number [2] + number [3] + number [4];
        System.out.println("This sum is  "+sum);
        System.out.println("This Average is  "+sum/5);



    }
}
