package July.Ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2 =sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Num1 is big");
        } else if (num2>num1)
        {
            System.out.println("num2 is big");
        }else
        {
            System.out.println("both numbers are equal");
        }
    }
}
