package July.Ex_27072024;

public class Lab103 {
    public static void main(String[] args) {
        int sal[]= {20,28,18,30,15,13,12,19,4};
        int min =sal[0];
        for (int i = 0; i < sal.length; i++)
        {
         if(sal[i]<min)
             min=sal[i];
        }
        System.out.println(min);
    }

}
