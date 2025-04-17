package July.Ex_21072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num whos factorial you wants to print");
        int n=sc.nextInt();

        int fact =1;
        for(int i=1; i<=n; i++)
        {
            fact = fact *i;
        }
        System.out.println(fact);
        sc.close();
    }
}
