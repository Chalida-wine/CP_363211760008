package Exersice;

import java.util.Scanner;

public class Exersice_Lab_3 {

    //galobl variable
    public  static  final  double PI = 3.141;


    public  static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter radius of circle :");
        double r = Scanner.nextDouble();

        double v = (4 / 3) * PI * r * r * r;

        System.out.println("The of circle is :"+v);



    }//main
}//class


