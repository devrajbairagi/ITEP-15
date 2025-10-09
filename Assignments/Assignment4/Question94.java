class Question94 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print((char)('a'+j-1));
            System.out.println();
        }
    }
}