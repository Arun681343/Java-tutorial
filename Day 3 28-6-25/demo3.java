import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //for loop
        //to repeat a particular task for n number of times
        // for(int i=1;i<11;i++){
        //     System.out.println(i);
        // }
        // for(int i=0;i<=5;i++){
        //     System.out.println("Arun");
        // }

        // System.out.print("Enter the starting number :");
        // int a = scan.nextInt();
        // System.out.print("Enter the ending number :");
        // int b = scan.nextInt();

        // for(int i = a;i<=b;i++){
        //     System.out.println(i);
        // }

        System.out.print("Enter the last number :");
        int a = scan.nextInt();

            //first n even digits
            for(int i =1;i<=a;i++){
                if(i%2==0){//made a mistake of typing a instead of i
                    System.out.println(i);
                }
            }
        //count odd numbers from 1 to 10
        int count=0;
        for(int i=1;i<=10;i++){
            if(i % 2!=0){
                System.out.println("Total :"+i);
            }
        }

    }
}