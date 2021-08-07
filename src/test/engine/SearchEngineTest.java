package engine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchEngineTest {

    @Test
    void search() {
        SearchEngine engine = new SearchEngine();
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq1.txt");
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq2.txt");
        engine.insert("bola", "arq2.txt");
        engine.insert("arvore", "arq2.txt");

        LinkedList files = engine.search("bola");
        assertEquals(2, files.searchFrequency("arq1.txt"));
        assertEquals(1, files.searchFrequency("arq2.txt"));
    }

    @Test
    void searchTerms() {
        SearchEngine engine = new SearchEngine();
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq1.txt");
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq2.txt");
        engine.insert("bola", "arq2.txt");
        engine.insert("arvore", "arq2.txt");

        LinkedList result = engine.searchTerms(new String[]{});
        assertTrue(result.isEmpty());
        LinkedList result2 = engine.searchTerms(new String[]{""});
        assertTrue(result2.isEmpty());
        LinkedList resultNull = engine.searchTerms(null);
        assertTrue(resultNull.isEmpty());

        LinkedList okResult1 = engine.searchTerms(new String[]{"bola"});
        System.out.println(Arrays.toString(okResult1.getNodesAsArray()));

        LinkedList okResult2 = engine.searchTerms(new String[]{"bola", "casa"});
        System.out.println(Arrays.toString(okResult2.getNodesAsArray()));
    }
}