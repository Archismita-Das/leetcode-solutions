class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int bit = 0;
            int masks = 1;
            for(int j=0; j<32; j++){
                if((masks&i)!=0){
                    bit++;
                }
                masks<<=1;
            }
            arr[i] = bit;
           
        }
        return arr;
        
    }
}