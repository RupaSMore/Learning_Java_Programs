package July.Ex_20072024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        //System.out.println(Math.max(num1,num2));
        if (num1>num2)
        {
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }

    }
}
