package easy;

public class find_index {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String subStr = haystack.substring(i, i + needle.length());
                if (subStr.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        find_index solution = new find_index();
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = solution.strStr(haystack, needle);
        System.out.println(result);
    }
}
