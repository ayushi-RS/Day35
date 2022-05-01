class Solution {
    List<Integer> arr = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for(int i = 1;i<arr.size();i++){
            if(arr.get(i-1) >= arr.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
        
    }
}