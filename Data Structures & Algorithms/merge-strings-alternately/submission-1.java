class Solution {
    public String mergeAlternately(String word1, String word2) {
       char[] arr1=word1.toCharArray();
       char[] arr2=word2.toCharArray();
       char[] res=new char[arr1.length+arr2.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<arr1.length && j<arr2.length ){
            if(k%2==0){
                res[k]=arr1[i];
                k++;
                i++;
              
            }else{
                res[k]=arr2[j];
                k++;
                j++;
            }
       }
       if(i==arr1.length){
        // String s=arr1.toString();
        // String reslt=res.toString();
        while(j<arr2.length){
            res[k++]=arr2[j++];
        }
        return new String(res);
       }else{
        while(i<arr1.length)
   {
    res[k++]=arr1[i++];
}        return new String(res);
       }
    }
}