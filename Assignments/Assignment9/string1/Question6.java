class Question6 {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "aaabbbacccababacccaabb";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) System.out.println(sub);
            }
        }
    }
}