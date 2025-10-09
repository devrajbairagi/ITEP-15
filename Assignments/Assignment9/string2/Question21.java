class Question21 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
