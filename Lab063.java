package July.Ex_20072024;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell What day it its");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                //break;
            case 2:
                System.out.println("Tue");
                //break;

            default:
                System.out.println("No idea, what day its");
               // break;
        }

        System.out.println("  ---- === Outside the Switch loop === -----");
    }
}
