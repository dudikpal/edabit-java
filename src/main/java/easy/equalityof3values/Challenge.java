package easy.equalityof3values;

public class Challenge {
    
    public static int equal(int a, int b, int c) {
    
        if (a == b || b == c || a == c) {
            if (a == b && a == c) {
                return 3;
            }
            return 2;
        }
        return 0;
        
        
        /*HashSet<Integer> result = new HashSet<>(List.of(a, b, c));
        if (result.size() == 1) {
            return 3;
        }
        if (result.size() == 2) {
            return 2;
        }
        return 0;*/
    }
}
