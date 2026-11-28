package counter;

/**
 * WordProcessor implementation of the {@link Counter} interface.
 *
 * Complete this class in Step 2 and Step 3 on your feature branches.
 */
public class WordProcessor implements Counter {

    // =========================================================================
    // STEP 3: Encapsulated Fallback State
    // =========================================================================

    // TODO [Step 3.1]: Declare a private String attribute called 'text' (default to "")
    private String text = "";

    // TODO [Step 3.2]: Implement getters and setters for 'text':
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // =========================================================================
    // STEP 2: Core Sentence Analysis Methods
    // =========================================================================

    /**
     * Counts the number of words in the given sentence.
     * Words are separated by single spaces.
     * In Step 3: If sentence is null, fall back to this.text.
     *
     * @param sentence input string to analyze
     * @return number of words
     */
    @Override
    public int countWords(String sentence) {
        // TODO [Step 3.3]: If sentence == null, assign sentence = this.text;

        // TODO [Step 2.1]: If sentence is empty, return 0; otherwise split on spaces.
        return sentence.split(" ").length ;
    }

    /**
     * Counts alphabetic letters only, ignoring spaces, punctuation, and digits.
     * In Step 3: If sentence is null, fall back to this.text.
     *
     * @param sentence input string to analyze
     * @return count of alphabetic letters
     */
    @Override
    public int countLetters(String sentence) {
        // TODO [Step 3.3]: If sentence == null, assign sentence = this.text;

        // TODO [Step 2.2]: Loop through character indices and count Character.isLetter(ch)

         int letters = 0;
            for (int i = 0; i < sentence.length(); i++) {
             if (Character.isLetter(sentence.charAt(i))) letters++;
         }
         return letters ;
    }

    /**
     * Returns the total character length of the sentence (including spaces).
     * In Step 3: If sentence is null, fall back to this.text.
     *
     * @param sentence input string to analyze
     * @return total length
     */
    @Override
    public int getLength(String sentence) {
        // TODO [Step 3.3]: If sentence == null, assign sentence = this.text;

        // TODO [Step 2.3]: Return sentence.length()
        return sentence.length() ;
    }
}