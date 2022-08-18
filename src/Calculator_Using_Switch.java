
import  java.util.Scanner;
public class Calculator_Using_Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER A :");
        double a=sc.nextDouble();

        System.out.println("ENTER B :");
        double b=sc.nextDouble();

        System.out.println("ENTER OPERATOR");
        String operator=sc.next();


        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/": System.out.println(a / b);
                break;
            case "%": System.out.println(a % b);
                break;
            default:
                System.out.println("INVALID OPERATOR");

        }
    }
}
