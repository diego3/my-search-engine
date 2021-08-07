package engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insertTerm() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert("bola", "arq1.txt");
        tree.insert("casa", "arq1.txt");
        tree.insert("dado", "arq1.txt");
        tree.insert("bola", "arq1.txt");
        tree.insert("casa", "arq1.txt");
        tree.insert("dado", "arq2.txt");
        tree.insert("bola", "arq2.txt");
        tree.insert("arvore", "arq2.txt");

        TreeNode bola = tree.search("bola");
        assertNotNull(bola);
        assertEquals(2, bola.getFrequencyOf("arq1.txt"));
        assertEquals(1, bola.getFrequencyOf("arq2.txt"));

        TreeNode casa = tree.search("casa");
        assertNotNull(casa);
        assertEquals(2, casa.getFrequencyOf("arq1.txt"));
    }
}