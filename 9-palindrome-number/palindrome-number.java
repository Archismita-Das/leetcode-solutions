class Solution {
    public boolean isPalindrome(int x) {
       int lastDigit;
        int num = Math.abs(x);
        int reverseNum=0;
        while(num>0){
           lastDigit = num%10;
           num/=10;
           reverseNum = (reverseNum*10)+lastDigit;
        }
        if(reverseNum == x){
            return true;
        }
        else{
            return false;
        }
       
       
    }
}