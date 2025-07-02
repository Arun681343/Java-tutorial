import java.util.Scanner;
public class demo4{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        //logical operators 
        //hungry+ice cream = eat
        boolean hungry = true;
        boolean icecream = false;

        // && and operator 
        //both values should be true 
        if(hungry&&icecream){ 
            System.out.println("Eat ");
        }
        else{
            System.out.println("Dont eat");
        }

        // || or operator in this if any onr value is true then it is true
        int a=24;
        if (a%2==0 || a%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //code
        System.out.print("Enter a value: ");
        int b = scan.nextInt();
        if (b%3==0 && b%5==0){
            System.out.println("It is divisible");
        }
        else{
            System.out.println("Not divisible");
        }
        System.out.println(15/3); // gives me quotient
        System.out.println(15%3); // gives me remainder

        //for 3 conditions we will use else if 
        int score;
        System.out.println("Enter your score: ");
        score=scan.nextInt();

        if(score >= 90){
            System.out.println("O");
        }
        else if(score >= 80){
            System.out.println("A+");
        }
        else if(score >= 60){
            System.out.println("B");
        }
        else{
            System.out.println("U");
        }
        
    }
}