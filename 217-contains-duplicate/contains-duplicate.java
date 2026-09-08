class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=nums[i];
            if(map.containsKey(need)){
                return true;
            }
            map.put(nums[i],i);
        }    
        return false;
    }
}