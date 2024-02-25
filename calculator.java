import java.util.Scanner;

public class calculator {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2=scanner.nextInt();
        System.out.print("Enter a operator ( + - * / ): ");
        char operator=scanner.next().charAt(0);

        int result=0;
        if (operator=='+') {
            result=num1+num2;
        }
        else if (operator=='-') {
            result=num1-num2;
        }
        else if (operator=='*') {
            result=num1*num2;
        }
        else if (operator=='/') {
            result=num1/num2;
        }

        System.out.println("The result is "+result);
    }
}
