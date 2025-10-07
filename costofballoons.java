import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            int G = sc.nextInt();  // Cost of green balloon
            int P = sc.nextInt();  // Cost of purple balloon

            int N = sc.nextInt();  // Number of participants

            int count1 = 0;  // Number of participants who solved problem 1
            int count2 = 0;  // Number of participants who solved problem 2

            for (int i = 0; i < N; i++) {
                int prob1 = sc.nextInt();
                int prob2 = sc.nextInt();

                if (prob1 == 1) count1++;
                if (prob2 == 1) count2++;
            }

            // Calculate two strategies
            int totalCost1 = count1 * G + count2 * P;
            int totalCost2 = count1 * P + count2 * G;

            // Print the minimum cost
            System.out.println(Math.min(totalCost1, totalCost2));
        }

        sc.close();
    }
}
