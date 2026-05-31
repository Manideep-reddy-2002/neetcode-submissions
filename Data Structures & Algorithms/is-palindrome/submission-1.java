class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                res.append(Character.toLowerCase(c));
            }
        }
        return res.toString().equals(res.reverse().toString());
        
    }
}
