import java.util.Scanner;

public class GpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int phy, eng, cal, ict, pf;

        System.out.println("Enter the marks of five subjects ");

        phy = sc.nextInt();
        eng = sc.nextInt();
        cal = sc.nextInt();
        ict = sc.nextInt();
        pf = sc.nextInt();

        float percentage = ((float)(phy + eng + cal + ict + pf) / 500 ) * 100;

        System.out.println("Your percentage is " + percentage);
    }
}
