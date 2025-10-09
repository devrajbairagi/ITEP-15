class Question48 {
    static String sortChars(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] > a[j]) { char t = a[i]; a[i] = a[j]; a[j] = t; }
        return new String(a);
    }
    public static void main(String[] args) {
        String s1 = "LISTEN".toLowerCase();
        String s2 = "SILENT".toLowerCase();
        System.out.println(sortChars(s1).equals(sortChars(s2)) ? "Anagram" : "Not Anagram");
    }
}
