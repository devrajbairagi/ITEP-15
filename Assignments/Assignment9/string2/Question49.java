class Question49 {
    public static void main(String[] args) {
        String s = "This is a test";
        int idx = 0;
        String token = "";
        while (idx < s.length()) {
            char c = s.charAt(idx);
            if (c != ' ') token += c;
            else {
                if (token.length() > 0) { System.out.println(token); token = ""; }
            }
            idx++;
        }
        if (token.length() > 0) System.out.println(token);
    }
}
