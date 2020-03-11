package string_package;

public class StringDemo2 {

    public static void main(String[] args) {

        String firstName = "Anisul";
        String lastName = " Islam";

        //String fullName = firstName + lastName;
        //System.out.println("Full Name = "+fullName);


        //full Name Together
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);

        //Upper Case Name
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);

        //Lower Case Name
        String lowerName = fullName.toLowerCase();
        System.out.println(lowerName);

        //start with method
        boolean b = firstName.startsWith("A");
        System.out.println(b);

        //End with method
        boolean last = lastName.endsWith("m");
        System.out.println(last);

        //Stirng array
        String [] name =  {"Anisul","sobuj","Shabbir"};
        for(int i = 0;i<3;i++) {
            System.out.println(name [i]);
        }

    }
}
