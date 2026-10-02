class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        String [] val = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        func(digits, 0, new String(), ls , val);

        return ls;
    }

    public static void func(String dig, int id , String str , List<String> ls, String[] val){
        if(id == dig.length()){
            ls.add(new String(str));
            return ;
        }
        
        String s = val[(dig.charAt(id) - '0') - 2];

        for(int i = 0 ; i < s.length()  ; i++){
            func(dig, id + 1,str + s.charAt(i) , ls , val );
        }
    }


}