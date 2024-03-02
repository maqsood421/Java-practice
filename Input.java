import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of num1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the value of num2: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum is: " + sum);

            boolean flag = false;
            System.out.println(flag);

            String str = sc.next(); // read one word
            String str2 = sc.nextLine(); // read whole line

            System.out.println(str);
            System.out.println(str2);
        }
        
    }
}
