package engine;

public class BinarySearchTree {
    private TreeNode root;

    private int length;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public BinarySearchTree() { }

    public void insert(String term, String fileName) {
        insertNode(root, term, fileName);
    }

    public void insertNode(TreeNode node, String term, String fileName) {
        if (root == null) {
            root = new TreeNode(term, fileName);
            length++;
            return;
        }

        if (node.getTerm().equals(term)) {
            node.updateFrequency(fileName);
        }
        else if (StringUtils.firstIsAfterSecond(term, node.getTerm())) {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(term, fileName));
                length++;
            } else {
                insertNode(node.getRight(), term, fileName);
            }
        } else { // term came before node.getTerm
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(term, fileName));
                length++;
            } else {
                insertNode(node.getLeft(), term, fileName);
            }
        }
    }

    public TreeNode search(String term) {
        return searchNode(root, term);
    }

    public LinkedList searchFiles(String term) {
        TreeNode node = search(term);
        if (node == null) {
            return null;
        }
        return node.getFileLinkedList();
    }

    private TreeNode searchNode(TreeNode node, String term) {
        if (node == null) {
            return null;
        }
        if (node.getTerm().equals(term)){
            return node;
        }

        if (StringUtils.firstIsAfterSecond(term, node.getTerm())) {
            return searchNode(node.getRight(), term);
        } else {
            return searchNode(node.getLeft(), term);
        }
    }

    /**
     *
     * @return If the tree have no nodes
     */
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     *
     * @return Quantity of nodes
     */
    public int getLength() {
        return length;
    }
}
