import java.util.Scanner;
import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Input numbers : ");
        int n = scanner.nextInt();
        while (n > 0){
            int mod = n % 2;
            numbers.push(mod);
            n = n/2;
        }
        System.out.println("Output numbers :");
        while (!numbers.isEmpty()){
            System.out.print(numbers.pop());
        }
    }
}
