package July.Ex_27072024;

public class Lab094 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
       marks[0] =10;
       marks[1] =20;
       marks[2] =30;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean [] is_married ={true, false, true};

        for (int i = 0; i < is_married.length; i++)
        {
            //System.out.println(i);
            //System.out.println(is_married[i]);
            System.out.println(i + "->" + is_married[i]);
        }



    }
}
