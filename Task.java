package taskexamples;

import java.util.Scanner;



public class Task {
    public static void main(String[] args) {



Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }

    }
}

