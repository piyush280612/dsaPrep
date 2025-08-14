package String;

public class CheckPalindrome {
    public static boolean chekIfPalindrome(String s){
        int right = s.length()-1;
        int left = 0;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "nitin";
        if (chekIfPalindrome(str)){
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome!");
        }

    }
}
