public class WordCollection {

    // Declare an array of Strings
    private String[] words;

    public WordCollection() {

        // Create the new array, to hold 5 Strings
        this.words = new String[5];
    }

    public int getWordCount() {
        return this.words.length;
    }
}
