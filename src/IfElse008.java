import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse008 {
    public static void main(String[] args) throws IOException {
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age:");
        age = Integer.parseInt(br.readLine());
        if (age >= 21) {
            System.out.println("You can enter the bar.");
        } else if (age >= 18) {
            System.out.println("You can vote but cannot enter the bar.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
