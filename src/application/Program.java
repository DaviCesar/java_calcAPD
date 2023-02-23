package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Rectangle rectangle = new Rectangle();
        System.out.printf("%nEnter rectangle properties %n");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("%nAREA: %.2f%n", rectangle.calcArea());
        System.out.printf("PERIMETER: %.2f%n", rectangle.calcPerimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.calcDiagonal());
        
        sc.close();
    }
}
