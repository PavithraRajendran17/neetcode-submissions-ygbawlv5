class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxarr = -1;
        for (int i = n - 1; i >= 0; i--) {
            int currentVal = arr[i];
            arr[i] = maxarr;
            if (currentVal > maxarr) {
                maxarr = currentVal;
            }
        } 
        return arr;   
    }
}