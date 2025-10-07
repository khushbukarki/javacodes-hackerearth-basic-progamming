import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

class FavouriteSinger {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read number of songs
        int N = Integer.parseInt(br.readLine());
        
        // Read the singers as a line and tokenize
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // Use HashMap to count frequency of each singer
        HashMap<Long, Long> freq = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long singer = Long.parseLong(st.nextToken());
            freq.put(singer, freq.getOrDefault(singer, 0L) + 1);
        }
        
        // Find the maximum frequency
        long maxFreq = 0;
        for (long count : freq.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        
        // Count how many singers have this maximum frequency
        long favouriteCount = 0;
        for (long count : freq.values()) {
            if (count == maxFreq) {
                favouriteCount++;
            }
        }
        
        // Output the result
        System.out.println(favouriteCount);
    }
}
