package String;

public class CountAndSay {

    public static String countAndSay(int n) {
        if (n == 1) return "1";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prev) {
                    count++;
                } else {
                    sb.append(count).append(prev);
                    prev = result.charAt(j);
                    count = 1;
                }
            }

            sb.append(count).append(prev); // for the last group
            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Count and Say Term " + n + ": " + countAndSay(n));
    }
}

