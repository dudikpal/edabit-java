package veryeasy.phonenumberformatting;

public class Program {
    
    public static String formatPhoneNumber(int[] nums) {
    
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sb.append("(");
            }
            if (i == 3) {
                sb.append(") ");
            }
            if (i == 6) {
                sb.append("-");
            }
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
