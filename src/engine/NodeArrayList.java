package engine;

public class NodeArrayList {

    private Node[] nodes;
    private int currentPos;

    public NodeArrayList(int length) {
        this.nodes = new Node[length];
        this.currentPos = 0;
    }

    public boolean isEmpty() {
        return nodes.length == 0;
    }

    public void add(Node node) {
        if ((currentPos+1) == nodes.length) {
            return;
        }
        this.nodes[currentPos] = node;
        currentPos++;
    }

    public void add(Node node, int pos) {

    }

    public int size() {
        return currentPos;
    }

    public Node[] getNodes() {
        return nodes;
    }
}
