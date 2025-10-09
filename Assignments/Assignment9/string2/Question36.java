class Question36 {
    public static void main(String[] args) {
        String s = "madam";
        boolean pal = true;
        for (int i = 0, j = s.length()-1; i < j; i++, j--) if (s.charAt(i) != s.charAt(j)) pal = false;
        System.out.println(pal);
    }
}
