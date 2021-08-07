package engine;

public class SearchEngine {
    private BinarySearchTree searchTree;

    public SearchEngine() {
        searchTree = new BinarySearchTree();
    }

    public void insert(String term, String fileName) {
        searchTree.insert(term, fileName);
    }

    public LinkedList search(String term) {
        return searchTree.searchFiles(term);
    }

    public LinkedList searchTerms(String[] terms) {
        LinkedList result = new LinkedList();
        if (terms == null) {
            return result;
        }

        for(String term : terms) {
            LinkedList list = search(term);
            if (list == null) {
                continue;
            }

            Node[] nodes = list.getNodesAsArray();
            for(Node node : nodes) {
                Node n = result.getNode(node.getFileName());
                if (n == null) {
                    result.append(node.getFileName(), node.getFrequency());
                } else {
                    int freq = n.getFrequency();
                    n.setFrequency(freq + node.getFrequency());
                }
            }
        }
        return result;
    }
}
