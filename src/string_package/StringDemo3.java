package string_package;

public class StringDemo3 {

    public static void main(String[] args) {

        String country = "    Bangladesh is   my country   ";
        System.out.println(country);

        String s3 = country.trim();
        System.out.println(s3);

        char ch = country.charAt(0);
        System.out.println("ch "+ch);

        int value = country.codePointAt(0);
        System.out.println(value);

        int pos = country.indexOf("is");
        System.out.println("first position of "+pos);

        int posi = country.lastIndexOf("n");
        System.out.println("Last position of "+posi);


    }
}
