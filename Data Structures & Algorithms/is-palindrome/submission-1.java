class Solution {
    public boolean isPalindrome(String s) {
    //     s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    //     char[] aS1 = s.toCharArray();
    //     int a=0;
    //     int b=s.length()-1;

    //     while(a<b){
    //         char temp=aS1[a];
    //         aS1[a]=aS1[b];
    //         aS1[b]=temp;
    //         a++;
    //         b--;
    //     }
    //   String rev=new String(aS1);
       
    //     return s.equals(rev);


        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] aS1 = s.toCharArray();
        int a=0;
        int b=s.length()-1;

        while(a<b){
         if(aS1[a]==aS1[b]){
            a++;
            b--;
         }else{
            return false;
         }
        
        }
      return true;
    }
}
