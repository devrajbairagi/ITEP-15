class Question5 {
    public static void main(String[] args) {
        String str = "Java Is Plateform Independent";
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            String rev = "";
            for (int i = w.length() - 1; i >= 0; i--) rev += w.charAt(i);
            result += rev + " ";
        }
        System.out.println(result.trim());
    }
}