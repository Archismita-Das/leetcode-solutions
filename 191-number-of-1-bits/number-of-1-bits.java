class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        int masks = 1;
        for(int i = 0; i<32; i++){
            if((masks&n)!=0){
                bits++;
            }
            masks<<=1;
        }
        return bits;
    }
}