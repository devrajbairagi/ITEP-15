class Question14 {
    public static void main(String[] args) {
        String s = "123456";
        boolean onlyDigits = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }
        System.out.println("Contains only digits: " + onlyDigits);
    }
}