//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Solution
{
    
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public int isSumProperty(Node root){
           if(check(root)){
                return 1;
           }
           return 0;
    }

    public boolean check(Node node){
        if(node.left == null && node.right == null){
            return true;
        }
        if(node.left == null){
            if(node.data == node.right.data){
                return check(node.right);
            }else{
                return false;
            }

        }

        if(node.right == null){
            if(node.data == node.left.data){
                return check(node.left);
            }else{
                return false;
            }
        }
        if((node.left.data + node.right.data) == node.data){
            boolean left = check(node.left);
            boolean right = check(node.right);
            return left & right;
        }
        return false;
       
        
    }
}

