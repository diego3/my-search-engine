package engine.sort;

import engine.Node;

public class BubbleSort {

    public static void sortDesc(Node[] nodes) {
        sort(nodes, true);
    }

    public static void sortAsc(Node[] nodes) {
        sort(nodes, false);
    }

    private static void sort(Node[] nodes, boolean desc) {
        for(int i=0; i < nodes.length; i++) {
            for(int j = 0; j < nodes.length; j++) {
                if (desc) {
                    if (nodes[i].getFrequency() > nodes[j].getFrequency()) {
                        swap(nodes, i, j);
                    }
                } else {
                    if (nodes[i].getFrequency() < nodes[j].getFrequency()) {
                        swap(nodes, i, j);
                    }
                }
            }
        }
    }

    private static void swap(Node[] nodes, int i, int j) {
        Node swap = nodes[j];
        nodes[j] = nodes[i];
        nodes[i] = swap;
    }
}
