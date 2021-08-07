package engine.sort;

import engine.LinkedList;
import engine.Node;

public class BubbleSortLinkedList {

    public static LinkedList sort(LinkedList list) {
        return list;
    }

//    public static void sortOld(LinkedList node) {
//        LinkedList aux = node;
//        while(aux != null) {
//            System.out.println(aux);
//            LinkedList j = node;
//            while (j != null) {
//                if (aux.getFrequency() < j.getFrequency()) {
//                    LinkedList swap = j;
//                    j = aux;
//                    aux = swap;
//                }
//                j = j.getNext();
//            }
//            aux = aux.getNext();
//        }
//    }
}
