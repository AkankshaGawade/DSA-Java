/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k)
    {
        Stack<TreeNode> st=new Stack<TreeNode>();
        TreeNode node=root;
        int cnt=0;
        while(true){
            if(node!=null){
            st.push(node);
            node=node.left;
          }
        else{
            if(st.isEmpty()==true)
                break;
            node=st.pop();
            cnt++;
            if(cnt==k)
                return node.val;
            
            node=node.right;
        }
    }
    return -1;
  }
}