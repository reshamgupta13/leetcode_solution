class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int m=num1.length()-1;
        int n=num2.length()-1;
        int carry=0,sum;
        while(m>=0 || n>=0|| carry>0){
            int digit1=(m>=0)? num1.charAt(m--)-'0':0;
            int digit2=(n>=0)? num2.charAt(n--)-'0':0;
            sum =digit1+digit2+carry;
            str.append(sum%10);
            carry=sum/10;
        }
        return str.reverse().toString();
    }
}