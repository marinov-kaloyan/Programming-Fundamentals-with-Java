package E08_TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class E05_MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
