package engine.sort;

import engine.Node;

public class QuickSortIterative {
    private final Node[] nodes;

    public QuickSortIterative(Node[] nodes) {
        this.nodes = nodes;
    }

    public void sorting() {
        sort(0, nodes.length - 1);
    }

    public static void sort(Node[] nodes) {
        QuickSortIterative s = new QuickSortIterative(nodes);
        s.sorting();
    }

    protected void sort(int left, int right){
        if (left < right) {
            int q = partition(left, right);
            sort(left, q);
            sort( q + 1, right);
        }
    }

    protected int partition(int left, int right){
        int pivot = nodes[left].getFrequency();
        int i = left;
        for(int j = left + 1; j <= right; j++) {
            if (nodes[j].getFrequency() > pivot) {
                i = i + 1;
                swap(i, j);
            }
        }

        swap(i, left);

        return i;
    }

    protected void swap(int a, int b) {
        Node temp = nodes[a];
        nodes[a] = nodes[b];
        nodes[b] = temp;
    }


}
