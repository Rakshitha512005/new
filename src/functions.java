import java.util.Scanner;
public class functions {//class name

    public static void main(String args[]) {//main method
        String name;//declaration of variable string
        System.out.println("PLEASE ENTER YOUR NAME::");//print statement
        Scanner sc = new Scanner(System.in);//to read the data from keyboard
        System.out.println("THE NAME OF THE STUDENT IS::" + sc.next());//to print the output

        int age;//declaration of variable int
        System.out.println("PLEASE ENTER YOUR AGE::");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("THE AGE OF THE STUDENT IS::" + sc1.nextInt());//to get the output in INT format

        long phoneNumber;//declaration of variable long
        System.out.println("PLEASE ENTER YOUR PHONE NUMBER::");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("THE PHONE_NUMBER OF THE STUDENT IS::" + sc2.nextLong());//to get the output in LONG format

        float weight;//declaration of variable float
        System.out.println("PLEASE ENTER YOUR WEIGHT::");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("THE WEIGHT OF THE STUDENT IS::" + sc3.nextFloat());//to get the output in FLOAT format

        double aadhar;//declaration of variable double
        System.out.println("PLEASE ENTER YOUR AADHAR NUMBER::");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("THE AADHAR NUMBER OF THE STUDENT IS::" + sc4.nextDouble());//to get the output in DOUBLE format

        //time to d

    }
}


