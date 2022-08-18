import java.util.Scanner;
public class Alpha_question_Conditonal_statements {
    public static void main(String[] args) {

        // Q.1 Write java program to get number from the user and print whether it is positive 0r negative...
        //     Scanner sc= new Scanner(System.in);
//        float a=sc.nextFloat();
//
//        if (a>=0){
//            System.out.println("positive");
//
//        } else {
//            System.out.println("negative"); }
        // OR

//        float a=sc.nextFloat();
//
//        String n= a>=0? "Positive":"negative";
//        System.out.println(n);


        //  Q.2 print fever if temperature is above 100 and otherwise print no fever ...

//        double t= 103.5;
//
//        if (t>100){
//            System.out.println("You have fever");
//        }else {
//            System.out.println("YOU don't have fever");
//             }

        // Q.3 Write a Java program to input week number(1-7) and print day of week name using switch case...
//        Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         switch (n){
//             case 1-> System.out.println("Monday");
//             case 2-> System.o+ut.println("tues");
//             case 3-> System.out.println("wed");
//             case 4-> System.out.println("thus");
//             case 5-> System.out.println("fri");
//             case 6-> System.out.println("say");
//             case 7-> System.out.println("sunday");
//             default -> System.out.println("default input");
//         }

        // Q.4 What will be the value of x & y in program:

//            int a=63;
//            int b=36;
//        boolean x= (a<b)?true:false;
//        int y= (a>b)?a:b;
//        System.out.println(x); // output= false
//        System.out.println(y); // output= 63

        // Q.5
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        String year= n%4==0 && (n%100!=0 || n%400==0)? "leap year":"not a leap year";
        System.out.println(year);
    }
}

