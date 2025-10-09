class Question7 {
    public static void main(String[] args) {
        String s = "aabbccddd";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) == -1) res += s.charAt(i);
        }
        System.out.println(res);
    }
}