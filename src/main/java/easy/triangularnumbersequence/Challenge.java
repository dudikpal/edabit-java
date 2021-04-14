package easy.triangularnumbersequence;

public class Challenge {
    
    public static int triangle(int n) {
        
        int result = 1;
        for (int i = 1; i < n; i++) {
            result += i + 1;
        }
        return result;
    }
}
