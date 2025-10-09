class Question30 {
    public static void main(String[] args) {
        String s = "abcaabccc";
        char maxChar = '\0';
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) if (s.charAt(j) == c) count++;
            if (count > maxCount) { maxCount = count; maxChar = c; }
        }
        System.out.println(maxChar);
    }
}
