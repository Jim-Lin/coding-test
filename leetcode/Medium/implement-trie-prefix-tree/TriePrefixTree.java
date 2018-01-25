class TrieNode {

    TrieNode[] children;
    boolean isWord;

    public TrieNode() {
        children = new TrieNode[26];
    }
}

class Trie {

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            int alphabet = word.charAt(i) - 'a';
            if (node.children[alphabet] == null) {
                node.children[alphabet] = new TrieNode();
            }

            node = node.children[alphabet];
        }

        node.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            int alphabet = word.charAt(i) - 'a';
            if (node.children[alphabet] == null) {
                return false;
            }

            node = node.children[alphabet];
        }

        return node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (int i = 0; i < prefix.length(); i++) {
            int alphabet = prefix.charAt(i) - 'a';
            if (node.children[alphabet] == null) {
                return false;
            }

            node = node.children[alphabet];
        }

        return true;
    }
}

public class TriePrefixTree {

    public static void main(String args[]) {
        Trie obj = new Trie();
        obj.insert("ten");
        obj.insert("tea");
        boolean param_2 = obj.search("te");
        boolean param_3 = obj.startsWith("te");

        System.out.println(param_2);
        System.out.println(param_3);
    }
}
