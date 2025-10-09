class Question11 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(s.intern() == s);
        System.out.println(s.equals(s.intern()));
    }
}
