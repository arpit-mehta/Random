class Solution {
    public void generate(int[] nums,int i,List<Integer> ds,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList(ds));
            return;
        }
        //take or pick a particular index into subsequence
        ds.add(nums[i]);
        generate(nums,i+1,ds,ans); 
        ds.remove(ds.size()-1); //while going back we also have to remove the added element
        
        //the element is not added to the subsequence
        generate(nums,i+1,ds,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
