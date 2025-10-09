class Question33 {
    public static void main(String[] args) {
        String s = "abcaabccc";
        char maxChar = '\0';
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) if (s.charAt(j) == c) cnt++;
            if (cnt > max) { max = cnt; maxChar = c; }
        }
        System.out.println(maxChar);
    }
}
