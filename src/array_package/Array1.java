package array_package;

public class Array1 {

    public static void main(String[] args) {

     int [] num = new int [5];
     //Disadvantage of array;
     //

     //when size is fixed ----is called static array--To over this problem--we use collection--Arraylist, Hashtable--dynamic array
     //story only similar datatype--To over this problem--we use object array
     num [0] = 10;
     num [1] = 20;
     num [2] = 30;
     num [3] = 40;
     num [4] = 50;

     int sum = num[0]+ num[1] +num[2]+num[3]+num[4];
     System.out.println("sum "+sum);

     int len = num.length;
     System.out.println(len);

     System.out.println(num[0]);

     //Object array:(Object is a class)--is used to store differet datatype values
     Object ob [] = new Object[6];
     ob [0]= "Tom";
     ob [1]= 25;
     ob [2]= 12.33;
     ob [3]= "1/1/1987";
     ob [4]= 'M';
     ob [5]= "London";

     System.out.println(ob[5]);

    }

}
