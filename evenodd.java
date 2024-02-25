import java.util.Scanner;

class evenodd{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        
        if (num%2==0) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }
}