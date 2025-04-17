package July.Ex_28072024;

public class Lab108 {
    public static void main(String[] args) {
        bank bank1 = new bank();
        bank bank2 =new bank();
        bank bank3 = new bank();

        bank1.name= "SBI";
        bank2.name="ICICI";
        bank3.name = "HDFC";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank3.name);

        bank2.balance=2000;
        bank1.balance=3000;

        System.out.println(bank1.balance);
        System.out.println(bank2.balance);
    }
}
