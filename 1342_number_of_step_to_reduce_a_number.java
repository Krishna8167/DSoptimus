class Solution {
    public int numberOfSteps(int num) {
       return countstep(num, 0);
    }

    int countstep(int num, int count) {
        
        if(num == 0 ) {
            return count;
        }

        if((num & 1) != 0) {
            return countstep(num - 1, count + 1);
        }
        else {
            return countstep(num / 2, count + 1);
        }
    }
}
