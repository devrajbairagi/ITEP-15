class Question45 {
    public static void main(String[] args) {
        String s = "hello world";
        String res = "";
        boolean cap = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') { res += c; cap = true; }
            else if (cap) { res += Character.toUpperCase(c); cap = false; }
            else res += c;
        }
        System.out.println(res);
    }
}
