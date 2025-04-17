package July.Ex_27072024;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float marks[] = new float[5];
        System.out.println("Enter the marks of subject1");
        marks[0]= sc.nextFloat();
        System.out.println("Enter the marks of subject2");
        marks[1]= sc.nextFloat();
        System.out.println("Enter the marks of subject3");
        marks[2]= sc.nextFloat();
        System.out.println("Enter the marks of subject4");
        marks[3]= sc.nextFloat();
        System.out.println("Enter the marks of subject5");
        marks[4]= sc.nextFloat();

       float avg =marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5;

        System.out.println("average of marks->" + avg);


    }
}
