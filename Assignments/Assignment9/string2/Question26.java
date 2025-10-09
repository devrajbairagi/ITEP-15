class Question26 {
    public static void main(String[] args) {
        String s = "Java Is Plateform Independent";
        String[] words = s.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String rev = "";
            for (int j = w.length() - 1; j >= 0; j--) rev += w.charAt(j);
            res += rev + (i < words.length - 1 ? " " : "");
        }
        System.out.println(res);
    }
}
