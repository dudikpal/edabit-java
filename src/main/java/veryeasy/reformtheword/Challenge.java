package veryeasy.reformtheword;

public class Challenge {
    
    public static String getWord(String left, String right) {
    
        return left.substring(0, 1).toUpperCase().concat(left.substring(1)).concat(right);
    }
}
