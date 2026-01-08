import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,ans = 0;
        char operation;
        Boolean Vaildoperation = true;

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        
        System.out.print("Enter the opertaion (+, -, *, /, ^): ");
        operation = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        switch(operation){
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.err.println("Math error! Cannot divide by 0!");
                    Vaildoperation = false;
                }else{
                    ans = num1 / num2;
                }
            }
            case '^' -> ans = Math.pow(num1,num2);
            default -> {Vaildoperation = false;  System.err.println("Not a valid operator");}   
        }

        if (Vaildoperation) {
            System.out.printf("%,.2f %c %,.2f = %,.2f",num1,operation,num2,ans);
        }else{
            System.err.println("Error: not a valid maths sum!");
        }
        

        input.close();
    }
}
