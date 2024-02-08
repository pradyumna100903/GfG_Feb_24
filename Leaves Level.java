
//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution
{
    boolean check(Node root)
    {
	 if (root == null)
        return true; 
    HashSet<Integer> set = new HashSet<>();
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int level = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        level++; 
        for (int i = 0; i < size; i++) {
            Node curr = queue.poll();
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
            if (curr.left == null && curr.right == null) set.add(level);
        }
    }

    return set.size()==1?true:false;
    }
}
