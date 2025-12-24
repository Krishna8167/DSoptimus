class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            sb.append(c - 'a' + 1);
        }

        int sum = 0; 
        while(k > 0) {

            sum = 0;
            for(int i = 0; i < sb.length() ; i++ ){
                sum += sb.charAt(i) - '0';
            }
            sb = new StringBuilder(String.valueOf(sum));
            k--;
        }

        return sum;
    }
}
