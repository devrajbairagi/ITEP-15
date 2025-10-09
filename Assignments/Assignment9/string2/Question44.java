class Question44 {
    public static void main(String[] args) {
        String a = "test";
        String b = new String("test");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
    }
}
