import java.util.Scanner;
        public class calculator {
            public static void main(String args[]) {
                char operator;
                double number1;
                double number2;
                double result;
                Scanner input = new Scanner(System.in);
                System.out.println("OPERATIONS TO BE PERFORMED= ADDITION(+),SUBTRACTION(-),MULTIPLICATION(*),DIVISION(/)");
                operator = input.next().charAt(0);

                System.out.println("ENTER NUMBER1::");
                number1 = input.nextDouble();
                System.out.println("ENTER NUMBER2::");
                number2 = input.nextDouble();
                switch (operator) {
                    case '+':
                        result=number1+number2;
                        System.out.println("THE ADDITION OF"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+result);
                        break;
                    case '-':
                        result=number1-number2;
                        System.out.println("THE SUBTRACTION OF"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+result);
                        break;
                    case '*':
                        result=number1*number2;
                        System.out.println("THE MULTIPLICATION OF"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+result);
                        break;
                    case '/':
                        result=number1/number2;
                        System.out.println("THE DIVISION OF"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+result);
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        break;

                }
                input.close();
            }
        }