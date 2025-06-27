import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ENter a String1");
        String name1= scan.nextLine();

        System.out.print("ENter a String2");
        String name2= scan.nextLine();

        System.out.println(name1);
        System.out.println(name2);


        // Strings
        String f1=new String("Apple");
        String f2=new String("Apple");
        /*
         * Here both will be stored in two diff memory locations
         * When it compares thr reference is compared and since the values will not be same it will return false
         */

        String a1="Arun";
        String a2="Arun";
        /*
         * a2 will have a pointer to the a1 since both have same end value3
         * it will check for reference 
         */

        System.out.println(f1==f2);
        System.out.println(a1==a2);

        //this will check the value inside the reference and we can get true
        System.out.println(f1.equals(f2));

        //else if and if else
        int mark = 70;
        if(mark==100){
            System.out.println("Centum");
        }
        else if(mark>80){
            System.out.println("Excellent");
        }
        else if(mark > 50){
            System.out.println("Pass");
        }

        //ternary
        int a=12;
        int b=112;
        System.out.println(a==b?"Yes":"No");
        //System.out.println(false?"Yes":"No");
    }
}