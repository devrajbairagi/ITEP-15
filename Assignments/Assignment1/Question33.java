class Question33 {
    public static void main(String[] args) {
        int total = 30 * 20;
        int path1 = 30 * 3;
        int path2 = 20 * 4;
        int overlap = 3 * 4;
        int usable = total - (path1 + path2 - overlap);
        System.out.println("Usable area: " + usable + " m²");
    }
}