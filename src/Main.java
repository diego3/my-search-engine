
import engine.LinkedList;
import engine.Node;
import engine.SearchEngine;

import java.util.Scanner;

/**
 * ATP de estrutura de dados PUCPR
 * @aluno Diego Rosa dos Santos
 * @professor Fellipe Medeiros Veiga
 */
public class Main {
    private static final SearchEngine engine;

    static  {
        engine = new SearchEngine();
        bootstrapBinarySearch();
    }

    public static void main(String[] args) {
        System.out.println("Entre com os termos a ser pesquisados (separados por espaço):");

        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        keyboard.close();
        String[] terms = line.split("\\s");
        LinkedList results = engine.searchTerms(terms);

        for(Node node : results.getSortedNodesDesc()) {
            System.out.println("File: "+node.getFileName() + " Freq:" + node.getFrequency());
        }
    }

    private static void bootstrapBinarySearch() {
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq1.txt");
        engine.insert("bola", "arq1.txt");
        engine.insert("casa", "arq1.txt");
        engine.insert("dado", "arq2.txt");
        engine.insert("bola", "arq2.txt");
        engine.insert("arvore", "arq2.txt");
    }
}
