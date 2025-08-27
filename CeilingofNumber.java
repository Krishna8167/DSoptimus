
class Main {
    public static void main(String[] args) {
       int[] arr = {1, 3, 5 ,7 , 16 , 34};
       int target = 13;
       int ans = ceiling(arr, target);
       System.out.println("The index is : "+ans);
    }
    
    static int ceiling(int[] arr ,int target) {
        int s = 0 , e = arr.length-1; // start -> s , end -> e.
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(target < arr[mid]) {
                e = mid -1;
            }
            else if(target > arr[mid]) {
                s = mid+1;
            }
            else {
               return mid;
            }
        }
        return s;
    }
}
