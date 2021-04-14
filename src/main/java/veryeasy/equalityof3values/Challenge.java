package veryeasy.equalityof3values;

import java.util.HashSet;
import java.util.List;

public class Challenge {
    
    public static int equal(int a, int b, int c) {
    
        HashSet<Integer> result = new HashSet<>(List.of(a, b, c));
        if (result.size() == 1) {
            return 3;
        }
        if (result.size() == 2) {
            return 2;
        }
        return 0;
    }
}
