package engine;

public class TreeNode {
    private String term;
    private LinkedList fileLinkedList;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
        fileLinkedList = new LinkedList();
    }

    public TreeNode(String term) {
        fileLinkedList  = new LinkedList();
        this.term = term;
    }

    public TreeNode(String term, String fileName) {
        fileLinkedList  = new LinkedList();
        this.term = term;
        updateFrequency(fileName);
    }

    public String getTerm() {
        return term;
    }

    public int getFrequencyOf(String fileName) {
        return fileLinkedList.searchFrequency(fileName);
    }

    public LinkedList getFileLinkedList() {
        return fileLinkedList;
    }

    public void updateFrequency(String fileName) {
        Node fileNode = fileLinkedList.getNode(fileName);
        if (fileNode == null) {
            fileLinkedList.append(fileName, 1);
        } else {
            int freq = fileNode.getFrequency();
            freq += 1;
            fileNode.setFrequency(freq);
        }
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
