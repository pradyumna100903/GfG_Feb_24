class GfG {
    
          
     Node findLCA(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b) {
            return root;
        }

        Node leftLCA = findLCA(root.left, a, b);
        Node rightLCA = findLCA(root.right, a, b);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    int findDistance(Node root, int key, int level) {
        if (root == null) {
            return -1;
        }

        if (root.data == key) {
            return level;
        }

        int leftDistance = findDistance(root.left, key, level + 1);
        if (leftDistance == -1) {
            return findDistance(root.right, key, level + 1);
        }

        return leftDistance;
    }
    
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = findLCA(root, a, b);
        int distanceA = findDistance(lca, a, 0);
        int distanceB = findDistance(lca, b, 0);
        return distanceA + distanceB;
    }
}
