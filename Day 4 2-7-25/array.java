import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] playlist = new String[3];        

        playlist[0]="Song1";
        playlist[1]="Song2";
        playlist[2]="Song3";

        System.out.println(playlist[0]);
        System.out.println(playlist[1]);
        System.out.println(playlist[2]);

        int[] num = new int[5];
        // System.out.print("Enter the numbers");
        // num[0]= scan.nextInt();
        // num[1]= scan.nextInt();
        // num[2]= scan.nextInt();
        // num[3]= scan.nextInt();
        // num[4]= scan.nextInt();

        // System.out.println("Avg = "+(num[0]+num[1]+num[2]+num[3]+num[4])/5);

        for(int i=0;i<=4;i++){
            System.out.print("Enter numbers: "+"["+i+"]");
            num[i]= scan.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.println("The elements are :"+num[i]);
        }
        
    }

    //over till 3.25.25hrs - Session 1

    
}
