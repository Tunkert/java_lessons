import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase009 {
    public static void main(String[] args) throws IOException {
        int dayOfWeek;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the integer value of the day of the week (1 - 7).");
        dayOfWeek = Integer.parseInt(br.readLine());
        switch (dayOfWeek) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Seriously, bro?");
        }
    }

}
