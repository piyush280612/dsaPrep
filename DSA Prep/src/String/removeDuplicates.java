package String;

import java.util.HashSet;

public class removeDuplicates {
    public static void removeDup(String s){

        HashSet <Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()){
            if (!seen.contains(ch)){
                seen.add(ch);
                sb.append(ch);
            }
        }
        System.out.println("After removing duplicates: " + sb.toString());
    }

    public static void main(String[] args) {
        String str = "abfjhdgdkjs";

        removeDup(str);
    }
}
