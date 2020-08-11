package Lab3;
//Grade RUTS
//0-49.99        F
//50.00 - 54.99  D
//55.00 - 59.99  D+
//60.00 - 64.99  C
//65.00 - 69.99  C+
//70.00 - 74.99  B
//75.00 - 79.99  B+
//80.00 - 100.00 A

import java.util.Scanner;

public class Example_if_else_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score, and I will tell your Grade ");
        double score = sc.nextDouble();
        //condition

        if (score <=49.99) {
            System.out.println("Your grade is F. ");

        }
    }
}
