package counter;

/**
 * Step 1: Complete the Counter interface contract.


 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly
 * public and abstract.
 */
public interface Counter {

    /**
     * Counts the number of words in a sentence.
     *
     * @param sentence the input string to analyze
     * @return the total number of words
     */
    int countWords(String sentence);

    /**
     * Counts the total number of alphabetic letters in a sentence.
     *
     * @param sentence the input string to analyze
     * @return the total number of alphabetic letters
     */
    int countLetters(String sentence);

    /**
     * Calculates the total character length, including spaces.
     *
     * @param sentence the input string to analyze
     * @return the total number of characters
     */
    int getLength(String sentence);
}