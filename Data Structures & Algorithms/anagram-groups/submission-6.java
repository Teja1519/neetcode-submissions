

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Map<String, List<String>> map = new HashMap<>();

        // for(String word : strs) {

        //     char[] arr = word.toCharArray();

        //     Arrays.sort(arr);

        //     String key = new String(arr);

        //     map.putIfAbsent(key, new ArrayList<>());

        //     map.get(key).add(word);
        // }

        // return new ArrayList<>(map.values());

        Map<String, List<String>> list=new HashMap<>();
        for(String s : strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            list.putIfAbsent(key, new ArrayList<>());
            list.get(key).add(s);
        }
        return new ArrayList<>(list.values());
    }
}