class Question22 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') sum += c - '0';
        }
        System.out.println(sum);
    }
}
