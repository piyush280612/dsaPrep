package String;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        // Convert back to string
        String reversed = new String(chars);
        System.out.println("Reversed String: " + reversed);
    }
}
