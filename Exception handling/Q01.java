import java.util.*;
public class TryCatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter: ");
            int a = sc.nextInt();
            System.out.print("Enter: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception : Cannot divide by zero");
        }

        System.out.println("Program executed.");
    }
}
