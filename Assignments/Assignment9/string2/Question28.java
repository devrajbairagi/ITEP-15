class Question28 {
    public static void main(String[] args) {
        String s = "swiss";
        char result = '\0';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) if (i != j && s.charAt(j) == c) repeated = true;
            if (!repeated) { result = c; break; }
        }
        System.out.println(result);
    }
}
