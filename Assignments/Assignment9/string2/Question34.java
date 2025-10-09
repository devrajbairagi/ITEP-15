class Question34 {
    public static void main(String[] args) {
        String s = "This is Java";
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) res += words[i] + (i>0?" ":"");
        System.out.println(res);
    }
}
