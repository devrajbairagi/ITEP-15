class Question4 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        char[] arr = {'H','e','l','l','o'};
        String s3 = new String(arr);
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println("String literal pool stores string literals to save memory.");
    }
}