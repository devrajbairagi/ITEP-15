class Question2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("Hello");
        s1.concat("World");
        sb.append("World");
        sbd.append("World");
        System.out.println("String: " + s1);
        System.out.println("StringBuffer: " + sb);
        System.out.println("StringBuilder: " + sbd);
    }
}