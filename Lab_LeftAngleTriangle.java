package July.Ex_27072024;

import java.util.Scanner;

public class Lab_LeftAngleTriangle {
    public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int i = Sc.nextInt();

        for(int j = i; j >=1;j--)

    {
        for (int k = 1; k <= j; k++) {
            System.out.print("*"); // for space

        }

//            for (int k = 0; k < j; k++) {
//                System.out.print("*");
            }
        System.out.println();
    }
}