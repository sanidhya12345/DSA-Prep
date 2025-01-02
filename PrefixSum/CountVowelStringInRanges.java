package PrefixSum;

public class CountVowelStringInRanges {
    public boolean checkSame(String st) {
        int n = st.length();
        char start = st.charAt(0);
        char end = st.charAt(n - 1);
        String vowels = "aeiou";
        return vowels.indexOf(start) != -1 && vowels.indexOf(end) != -1;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n];
        prefix[0] = checkSame(words[0]) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + (checkSame(words[i]) ? 1 : 0);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
        }
        return ans;
    }
}