package July.Ex_20072024;

public class Lab001_FizzBuzz {
    public static void main(String[] args) {
       // int i =0;
        for(int i=0; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i + " FizzBuzz");
            } else if (i%3==0) {
            System.out.println(i + " Fizz");
            }
            else
                System.out.println(i + " Buzz");
        }
    }
}
