import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        List<Integer> digits = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        number = scanner.nextInt();

        while(number > 0){
            int digit = number % 10;
            digits.add(digit);
            number /= 10;
        }

        for (int digit: digits) {
            sum += digit;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
