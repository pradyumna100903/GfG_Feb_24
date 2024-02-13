//User function Template for Java


/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution{
    Node cloneGraph(Node node){
         if (node == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        HashMap<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node originalNode = queue.poll();
            Node cloneNode = map.get(originalNode);

            if (originalNode.neighbors != null) {
                for (Node neighbor : originalNode.neighbors) {
                    Node cloneNeighbor = map.get(neighbor);

                    if (cloneNeighbor == null) {
                        queue.add(neighbor);
                        cloneNeighbor = new Node(neighbor.val);
                        map.put(neighbor, cloneNeighbor);
                    }

                    cloneNode.neighbors.add(cloneNeighbor);
                }
            }
        }

        return map.get(node);
    }
}
