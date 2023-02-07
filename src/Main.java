import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How much credit do you want to take over 12 months?");
        Scanner amountScan = new Scanner(System.in);
        int amountCredit = amountScan.nextInt();

        System.out.println("How high is the rate you have to apply to?");
        Scanner amountRate = new Scanner(System.in);
        int amountRate2 = amountRate.nextInt();

        System.out.println("Which month do you want to calculate?");
        Scanner monthScan = new Scanner(System.in);
        int amountMonth = monthScan.nextInt();

        int amountMonthlyPay = amountCredit/12;

        for (int i = 1; i <= amountMonth; i ++){
            System.out.println("Schulden nach Monat " + "amountMonth " + i*((amountCredit/12)*(1+100/amountRate2)));
        }




    }
}