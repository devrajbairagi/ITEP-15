class Question29 {
    public static void main(String[] args) {
        String s = "aabbccddd";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1) res += c;
        }
        System.out.println(res);
    }
}
