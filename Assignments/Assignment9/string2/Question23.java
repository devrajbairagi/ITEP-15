class Question23 {
    public static void main(String[] args) {
        String s = "Hello world this is Java";
        String[] words = s.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) if (words[i].length() > 0) count++;
        System.out.println(count);
    }
}
