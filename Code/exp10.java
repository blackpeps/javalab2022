import java.util.Scanner;
public class Test {
    public static void divide (int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not possible");
        }
        else {
            System.out.println("Result =" + a/b);
        }
    }
    public static void main(String args[]) {
        int x, y;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of x: ");
            x= sc.nextInt();
            System.out.println("Enter the value of y: ");
            y= sc.nextInt();
            divide(x,y);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of Program");
        }
    }
}
