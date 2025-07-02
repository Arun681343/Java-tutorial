import java.util.Scanner;
public class session_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter the size of array :");
        // int a = scan.nextInt();
        // int sum=0;
        // int[] num = new int[a];

        // for(int i=0;i<a;i++){
        //     System.out.print("Enter the element"+"["+i+"]");
        //     num[i]= scan.nextInt();
        // }
        // for(int i=0;i<a;i++){
        //     sum=sum+num[i];
        // }
        // System.out.println("The sum is : "+sum);
        // System.err.println("The size of array is :"+num.length);


        // for(int i=0;i<=10;i++){
        //     System.out.println("64"+"*"+i+"="+64*i);
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         // System.out.println("array elements : "+"["+arr1[i]+"]"+"["+arr1[j]+"]");
        //         System.out.println("array elements : [" + i + "][" + j + "] = " + arr1[i][j]);

        //     }
        // }

        //loop inside loop is called nested loop
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        int[][] sum1 = new int[5][5];
        System.out.println("First array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENter array elements : "+"["+i+"]"+"["+j+"]");
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Second array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENter array elements : "+"["+i+"]"+"["+j+"]");
                arr2[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of the two arrays:");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
        System.out.print(sum1[i][j] + " ");
    }
    System.out.println();  // move to next line after each row
}
//3 43 00

        

    }
}
