package July.Ex_14072024;

public class Lab046 {
    public static void main(String[] args) {
        String s1 = "Testing";
        String s2 = "Testing";

        String s3 = new String("Testing");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

    }
}
