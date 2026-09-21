class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int index=0;
        boolean[] used=new boolean[nums2.length];
        for(int i=0;i<=nums1.length-1;i++){
            for(int j=0;j<=nums2.length-1;j++){
                if(nums1[i]==nums2[j]&& !used[j]){
                    res[index]=nums1[i];
                    index++;
                    used[j]=true;
                  break; 
                }
             
            }
        }
        return Arrays.copyOf(res,index);
    }
}