import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2=scanner.nextInt();
        scanner.close();
        if (num1>num2) {
            System.out.println("The largest number is "+num1);
        } else {
            System.out.println("The largest number is "+num2);
        }
    }   
}
