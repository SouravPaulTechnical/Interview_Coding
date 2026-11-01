public class Problem20 {
    public static void reverseEachWordInSentence(String inputSentence){
        String[] eachWord = inputSentence.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=eachWord.length-1; i>-1;i--){
            stringBuilder.append(eachWord[i]);
            if (i!=0){
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        String inputSentence = "I love java programming";
        reverseEachWordInSentence(inputSentence);
    }
}
