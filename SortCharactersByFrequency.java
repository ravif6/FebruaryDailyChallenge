class Solution {
    public String frequencySort(String s) {
        char c[] = s.toCharArray();
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        List<Character> list[] = new ArrayList[n + 1];
        for(int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for(char i : c) {
            int curr = freq.getOrDefault(i, 0) + 1;
            list[curr].add(i);
            freq.put(i, curr);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = n; i >= 0; i--) {
            for(char ch : list[i]) {
                // if(freq.get(ch) == i) {
                    for(int iter = 0; iter < i; iter++) {
                        sb.append(ch);
                    }
                // }
            }
        }
        return sb.toString();
    }
}