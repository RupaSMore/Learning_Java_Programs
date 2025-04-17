package July.Ex_20072024;

import java.util.Scanner;

public class Lab001_traingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of side1");
        int side1 = sc.nextInt();
        System.out.println("Enter size of side2");
        int side2 =sc.nextInt();
        System.out.println("Enter size of side3");
        int side3 = sc.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("Triangle is Equilateral");
        } else if
        (side1 !=side2 && side2 !=side3 && side1 !=side3) {
            System.out.println("Triangle is scalen");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("Triangle is isoscales");
        }
    }
}
