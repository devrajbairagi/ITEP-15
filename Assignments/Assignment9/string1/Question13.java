class Question13 {
    static String sortString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    char t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";
        System.out.println(sortString(s1.toLowerCase()).equals(sortString(s2.toLowerCase())) ? "Anagram" : "Not Anagram");
    }
}