class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = permutation("",digits);
        return ans;
    }

    static ArrayList<String> permutation(String p, String up) {

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int letterCount = (digit == 7 || digit == 9)? 4:3;
        int offset = (digit - 2) * 3;
        if (digit > 7) {
            offset++;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0 ;i < letterCount ; i++) {

            char ch = (char) ('a' + offset + i);
            ans.addAll(permutation(p + ch, up.substring(1)));

        }

        return ans;
    }
}
