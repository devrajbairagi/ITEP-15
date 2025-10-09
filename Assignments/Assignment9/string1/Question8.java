class Question8 {
    public static void main(String[] args) {
        String s = "aabbccddd";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }
            boolean printed = false;
            for (int k = 0; k < i; k++) if (s.charAt(k) == ch) printed = true;
            if (!printed) System.out.println(ch + " - " + count + " times");
        }
    }
}