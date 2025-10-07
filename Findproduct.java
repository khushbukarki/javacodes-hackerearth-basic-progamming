import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int N = sc.nextInt();
        long[] A = new long[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        // Define modulus
        long MOD = 1000000007;
        long product = 1;

        // Compute product modulo MOD
        for (int i = 0; i < N; i++) {
            product = (product * A[i]) % MOD;
        }

        // Print result
        System.out.println(product);
        sc.close();
    }
}
