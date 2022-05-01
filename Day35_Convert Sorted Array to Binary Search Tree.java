class Solution {
public TreeNode sortedArrayToBST(int[] nums) {

    TreeNode root = new TreeNode();
    
    int len = nums.length;
    
   return createBST(nums,0,len-1);
    
    
    
}

public TreeNode createBST(int[] nums , int start , int end){
    
    if(start>end) return null;
    
    int  mid = (start+end)/2;
    
    TreeNode root = new TreeNode(nums[mid]);
    
    root.left = createBST(nums , start , mid-1);
    root.right = createBST(nums,mid+1,end);
    return root;
}
}