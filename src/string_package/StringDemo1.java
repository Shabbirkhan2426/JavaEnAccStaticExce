package string_package;

public class StringDemo1 {

    public static void main(String[] args) {

        String s1 = "";
        String s2 =  new String ("Shabbir Khan");

        char [] s3 = {'a','n','i','s'};
        System.out.println(s3);

        System.out.println("s1  ="+s1);
        System.out.println("s2  ="+s2);

        int len = s1.length();
        System.out.println("String s1 ="+len);

        /*if(s1.equals(s2)){
            //.equals for value compare
            System.out.println("equal");
        }else{

            System.out.println("not equal");
        }*/
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }else {

            System.out.println("not equal");
        }
        boolean con = s1.contains("islam");
        System.out.println(con);

        boolean boo = s1.isEmpty();
        System.out.println(boo);
    }
}
