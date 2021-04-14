package easy.conveniencestore;

public class Program {
    
    public static boolean changeEnough(int[] change, double amountDue) {
    
        int quarter = change[0] * 25;
        int dime = change[1] * 10;
        int nickel = change[2] * 5;
        int penny = change[3];
        
        return amountDue * 100 <= quarter + dime + nickel + penny;
    }
}
