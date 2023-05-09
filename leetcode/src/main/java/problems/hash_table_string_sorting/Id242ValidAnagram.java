package problems.hash_table_string_sorting;

public class Id242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] numbers = new int[26];
        char a = 'a';
        for (char c : s.toCharArray()) {
            int index = c - a;
            numbers[index]++;
        }

        for (char c : t.toCharArray()) {
            int index = c - a;
            numbers[index]--;
            if (numbers[index] < 0) return false;
        }
        return true;
    }
}
