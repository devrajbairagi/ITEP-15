class Question32 {
    public static void main(String[] args) {
        String s = "hello";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1) res += c;
        }
        System.out.println(res);
    }
}
