package engine;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NodeArrayListTest {

    @Test
    void testInsertionAndSizeProperty() {
        NodeArrayList list = new NodeArrayList(10);
        list.add(new Node("File1.txt", 2));
        list.add(new Node("File2.txt", 2));

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.isEmpty());
    }
}