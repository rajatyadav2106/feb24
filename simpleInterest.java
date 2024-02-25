import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principle=scanner.nextInt();
        System.out.print("Enter the time (in years): ");
        int time=scanner.nextInt();
        System.out.print("Enter the rate of interest(in percentage): ");
        int rate=scanner.nextInt();
        System.out.println("The amount is "+principle*rate*time);
    }
}
