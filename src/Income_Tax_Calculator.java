import java.util.Scanner;

public class Income_Tax_Calculator {
        public static void main(String[] args) {
            // INCOME TAX CALCULATOR

//         income<5L - 0% tax
//         income between 5-10l - 20% tax
//         income >10l - 30% tax

            Scanner sc= new Scanner(System.in);
            double i= sc.nextDouble();
            double tax;

            if (i<=500000){
                tax=0;
            } else if (i>500000 && i<=1000000) {
                tax=i*0.2;

            } else {
                tax=i*0.3;
            }
            System.out.println("YOUR TAX IS = "+ tax);

        }

    }


