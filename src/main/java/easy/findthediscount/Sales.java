package easy.findthediscount;

public class Sales {
    
    public static double discount(int price, int percentage) {
    
        return price - (price * percentage * 0.01);
    }
}
