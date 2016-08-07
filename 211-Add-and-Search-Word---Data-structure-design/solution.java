public class WordDictionary {
    private WordDictionary[] children = new WordDictionary[26];
    private boolean isWord;
    public WordDictionary(){}
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        if (word.length() == 0) {
            this.isWord = true;
            return;
        }
        int index = word.charAt(0) - 'a';
        if (this.children[index] == null) {
            this.children[index] = new WordDictionary();
        }
        this.children[index].addWord(word.substring(1));
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        if (word.length() == 0) return this.isWord;
        if (word.charAt(0) != '.') {
            int index = word.charAt(0) - 'a';
            if (this.children[index] == null) return false;
            return this.children[index].search(word.substring(1));
        } else {
            boolean ans = false;
            for (WordDictionary wd : this.children) {
                if (wd != null) ans = ans || wd.search(word.substring(1));
                if (ans) return true;
            }
            return ans;
            
        }
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");