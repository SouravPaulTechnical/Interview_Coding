public class Problem20 {
    /**
     * Prints the sentence with its words in reverse order.
     * For example, "I love java" becomes "java love I".
     */
    public static void reverseEachWordInSentence(String inputSentence){
        // Split the sentence into words using whitespace as the delimiter.
        String[] eachWord = inputSentence.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();

        // Append the words from last to first, inserting spaces between them.
        for (int i=eachWord.length-1; i>-1;i--){
            stringBuilder.append(eachWord[i]);
            if (i!=0){
                stringBuilder.append(" ");
            }
        }

        // Display the sentence after reversing the word order.
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        // Sample sentence used to demonstrate the method.
        String inputSentence = "I love java programming";
        reverseEachWordInSentence(inputSentence);
    }
}
