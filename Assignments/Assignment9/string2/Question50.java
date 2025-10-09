class Question50 {
    public static void main(String[] args) {
        String s = "one,two;three four";
        String token = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' || c == ',' || c == ';') {
                if (token.length() > 0) { System.out.println(token); token = ""; }
            } else token += c;
        }
        if (token.length() > 0) System.out.println(token);
    }
}
