package shopee0719;

public class test01 {
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(){

        }
        public TreeNode(int val){
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        //TreeNode root = new TreeNode(1);
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
        dfs(first);
        System.out.println(fifth);

    }

    public static void print(TreeNode node){
        if (node == null) return;
        System.out.println(node.val);
        print(node.left);
        print(node.right);
    }

    public static void dfs(TreeNode root){
        if(root.left != null) dfs(root.left,root);
        if(root.right != null) dfs(root.right,root);
    }
    public static void dfs(TreeNode node, TreeNode pre){
        if(node.left == null && node.right == null) return;

        if(node.left != null) {
            dfs(node.left, node);
            TreeNode tail = node.left;                //寻找左子树链表的尾节点
            while(tail.right != null){
                tail = tail.right;
            }
            tail.right = node;
        }else{
            node.right = pre;

        }

        if(node.right != null){
            dfs(node.right, node);
            TreeNode head = node.right;                 //寻找右子树链表的头节点
            while(head != null){
                head = head.left;
            }
            node.right = head;
        }else{
            pre.right = node;
            node.left=null;
        }


    }


}
