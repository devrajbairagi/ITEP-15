class Question12 {
    public static void main(String[] args) {
        String s = "67, 89, 23, 67, 12, 55, 66";
        String[] arr = s.split(", ");
        int sum = 0;
        for (String val : arr) sum += Integer.parseInt(val);
        System.out.println("Sum: " + sum);
    }
}