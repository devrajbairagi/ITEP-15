class Question10 {
    public static void main(String[] args) {
        String s = "Apple orange umbrella cat eagle";
        String[] words = s.split(" ");
        int count = 0;
        for (String w : words) {
            char c = Character.toLowerCase(w.charAt(0));
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
        }
        System.out.println("Words starting with vowel: " + count);
    }
}