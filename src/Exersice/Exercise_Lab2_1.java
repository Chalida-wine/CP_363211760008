package Exersice;

import java.util.Scanner;

public class Exercise_Lab2_1 {
    public  static  void  main(String)[] arge {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int b = scanner.nextInt();
        System.out.print("Enter number 3 : ");
        int c = scanner.nextInt();
        System.out.print("Enter number 4 :");
        int d = scanner.nextInt();
        System.out.print("Enter number 5 :");
        int f = scanner.nextInt();

        //finding
        int total = a + b + c + d + f;
        int avy = total / 5;

        //display
        System.out.print("Total =" + total);
        System.out.print("Average =" + avy);

    }//main
}//class
