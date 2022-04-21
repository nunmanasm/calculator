import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number1 = input.nextDouble();
        System.out.println("Please enter a second number");
        double number2 = input.nextDouble();
        double result = number1 + number2;
        System.out.println(result);
        //2nd version
    }
}

