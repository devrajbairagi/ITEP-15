class Question11 {
    public static void main(String[] args) {
        String name = "Ramesh Kumar";
        int count = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
        }
        System.out.println("Vowels count: " + count);
    }
}