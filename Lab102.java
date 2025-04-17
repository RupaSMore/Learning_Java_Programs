package July.Ex_27072024;

public class Lab102 {
    public static void main(String[] args) {
        //max value from array
        // or max salary
        int [] salary ={7, 12,8,4,25,15,29};
        int max=1;
        for (int i = 0; i < salary.length; i++)
        {
        if (salary[i]>max)
            max= salary[i];
        }
        System.out.println(max);
    }
}
