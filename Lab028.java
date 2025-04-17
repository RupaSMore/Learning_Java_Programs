package July.Ex_14072024;

public class Lab028 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        int c= a + b;
        //byte d = a+b; should be int
        System.out.println(c);
        char a1 ='A';
        char b1 ='B';
       // char c1 =a1+b1; A+B will become string hence it will show error with char datatype
        int c1 =a1+b1;
        System.out.println(c1);// 65+66
        System.out.println('A'==65);
        System.out.println('B'==66);

    }

}
