
import java.util.*;

public class Zoos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().trim();

        int countZ = 0;
        int countO = 0;

        // Count Zs and Os
        for (char ch : word.toCharArray()) {
            if (ch == 'z' || ch == 'Z') {
                countZ++; 
            }else if (ch == 'o' || ch == 'O') {
                countO++;
            }
        }

        // Check the zoo condition
        if (countO == 2 * countZ) {
            System.out.println("Yes"); 
        }else {
            System.out.println("No");
        }

        sc.close();
    }
}
