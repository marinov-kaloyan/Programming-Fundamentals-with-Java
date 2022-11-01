package L04_Methods;

import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (actionInput) {
            case "add":
                printAddNumbers(firstNumInput, secondNumInput);
                break;
            case "multiply":
                printMultiplyNumbers(firstNumInput, secondNumInput);
                break;
            case "subtract":
                printSubtractNumbers(firstNumInput, secondNumInput);
                break;
            case "divide":
                printDivideNumbers(firstNumInput, secondNumInput);
                break;
        }
    }

    public static void printAddNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
