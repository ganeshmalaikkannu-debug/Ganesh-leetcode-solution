class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:nums2){
            if(s.contains(x)){
                list.add(x);
                s.remove(x);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}