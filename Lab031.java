package July.Ex_14072024;

public class Lab031 {
    public static void main(String[] args) {

        // widening
        byte a =10;
        int b=a; //valid implicit casting by JVM
      //  System.out.println(b);
        int b1 =(int)a; //valid casting

        //Narrowing
        int c =300;
      //  byte d=c;  //invalid implicit
        byte d = (byte) c;   // invalid explicit casting
        System.out.println(d);
    }
}
