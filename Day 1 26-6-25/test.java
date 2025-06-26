/*
 * Vairables
 * Data types
 * User input and print output
 */
import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = scan.nextInt();
        double score = scan.nextDouble();

        scan.nextLine();//this will parse the scan to next new object if not used we cannot input data

        String dept = scan.nextLine();


        System.out.println("My name is "+name+" and my age is "+age);
        System.out.println("My score is "+score/10+"/10");
        System.out.println("My department is "+dept);

        
        
    }
}