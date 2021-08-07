package engine;

public class Node {
    private String fileName;
    private int frequency;
    private Node next;

    public Node(String fileName, int frequency) {
        this.fileName = fileName;
        this.frequency = frequency;
        this.next = null;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFrequency() {
        return frequency;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("File:%s Freq: %d", fileName, frequency);
    }
}
