package July.Ex_14072024;

public class Lab033 {
    public static void main(String[] args) {
        int course = 100;
        float GST =18.45f;
        //int total = course + GST; // implicit casting narrowing JVM is giving error
        //int total = course + (int)GST; // will loss the data
        float total = course + GST;// no loss off data
        System.out.println(total);

    }
}
