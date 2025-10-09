class Question9 {
    public static void main(String[] args) {
        String s = "Dear Student ,You have need to work hard";
        String[] words = s.split(" ");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println(longest);
    }
}