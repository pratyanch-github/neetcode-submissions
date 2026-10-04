class Solution {
    public boolean isPalindrome(String s) {
        int i,n;
        i=0;
        n=s.length();
        if(n==1 || n==0)return true;

        if(Character.isLetterOrDigit(s.charAt(i)) )
        {
            if(Character.isLetterOrDigit(s.charAt(n-1)))
            {
               char chs = Character.toLowerCase(s.charAt(i));
               char che = Character.toLowerCase(s.charAt(n-1));
               if(chs==(che)) 
               {
                System.out.println(s + " going for 0=> " + s.charAt(1) + " " + s.charAt(n-2));
                return isPalindrome(s.substring(1,n-1));
               }
               else return false;
            }
            else{
                System.out.println(s + " going for 1=> " + 0 + " " + (n-1));
                return isPalindrome(s.substring(0,n-1));
            }
        }
        else {
            
            System.out.println(s + " going for 2=> " + 1 + " " + (n-1));
            return isPalindrome(s.substring(1));
        }
    }
}
