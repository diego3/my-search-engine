package engine.sort;

import engine.Node;

public class QuickSort {
    private Node[] nodes;
    private int last;

    public void sorting(Node[] nodes) {
        this.nodes = nodes;
        last = nodes.length -1;
        quick(0, last);
    }

    public static void sort(Node[] nodes) {
        QuickSort q = new QuickSort();
        q.sorting(nodes);
    }

    protected void quick(int left, int right) {
        int index;

        if (last > 1) {
            index = partition(left, right);

            if (left < index - 1) {
                quick(left, index - 1);
            }

            if (index < right) {
                quick(index, right);
            }
        }
    }


    protected int partition(int left, int right) {
        int pivot = nodes[(left + right) / 2].getFrequency();
        int i = left;
        int j = right;

        while (i <= j) {
            while (nodes[i].getFrequency() < pivot) {
                i++;
            }

            while (nodes[j].getFrequency() > pivot) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        return i;
    }


    protected void swap(int a, int b) {
        Node aux = nodes[a];
        nodes[a] = nodes[b];
        nodes[b] = aux;
    }

}
