class Question40 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        int up = 0, low = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) up++; else if (Character.isLowerCase(c)) low++;
        }
        System.out.println("Uppercase: " + up + " Lowercase: " + low);
    }
}
