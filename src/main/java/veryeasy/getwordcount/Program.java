package veryeasy.getwordcount;

public class Program {
    
    public static int countWords(String s) {
        
        String[] words = s.split("\\s");
        return words.length;
    }
}
