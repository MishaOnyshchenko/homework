public class DictionaryTest {

    public static void main(String[] args) {

        ArrayList<Dictionary> dictionary = new ArrayList<>();
        createCollection(dictionary);

        Transcription transcription = Transcription.WITH; //vocabulary with transcription
        //Transcription transcription = Transcription.WITHOUT; // vocabulary without transcription

        switch (transcription) {
            case WITH:
                //printPerThreeWith(dictionary); //To show 3 words inline (with transcription)
                printPerFourWith(dictionary); //To show 4 words inline (with transcription)
                break;

            case WITHOUT:
                //printPerThreeWithout(dictionary); //To show 4 words inline (without transcription)
                //printPerFourWithout(dictionary); //To show 4 words inline (without transcription)
                break;
        }

        ArrayList<Dictionary> learned = new ArrayList<>();
        learnedWords(dictionary, learned, 2);
        printSize(learned);
        findWord(dictionary, learned, "word #3");

    }

    public static void createCollection(ArrayList<Dictionary> dictionary) {
        for (int i = 1; i <= 10; i++) {
            dictionary.add(new Dictionary("word #" + i, "transcript #" + i, "translate #" + i));
        }
    }

    public static void printPerThreeWith(ArrayList<Dictionary> dictionary) {
        for (int i = 0; i < dictionary.size() - 2; i = i + 3) {
            System.out.println(dictionary.get(i).getWord() + "\t\t" + dictionary.get(i + 1).getWord() + "\t\t" + dictionary.get(i + 2).getWord());
            System.out.println(dictionary.get(i).getTranscription() + "\t" + dictionary.get(i + 1).getTranscription() + "\t" + dictionary.get(i + 2).getTranscription());
            System.out.println(dictionary.get(i).getTranslation() + "\t" + dictionary.get(i + 1).getTranslation() + "\t" + dictionary.get(i + 2).getTranslation());
            System.out.println();
        }
    }

    public static void printPerThreeWithout(ArrayList<Dictionary> dictionary) {
        for (int i = 0; i < dictionary.size() - 2; i = i + 3) {
            System.out.println(dictionary.get(i).getWord() + "\t\t" + dictionary.get(i + 1).getWord() + "\t\t" + dictionary.get(i + 2).getWord());
            System.out.println(dictionary.get(i).getTranslation() + "\t" + dictionary.get(i + 1).getTranslation() + "\t" + dictionary.get(i + 2).getTranslation());
            System.out.println();
        }
    }

    public static void printPerFourWith(ArrayList<Dictionary> dictionary) {
        for (int i = 0; i < dictionary.size() - 3; i = i + 3) {
            System.out.println(dictionary.get(i).getWord() + "\t\t" + dictionary.get(i + 1).getWord() + "\t\t" + dictionary.get(i + 2).getWord() + "\t\t" + dictionary.get(i + 3).getWord());
            System.out.println(dictionary.get(i).getTranscription() + "\t" + dictionary.get(i + 1).getTranscription() + "\t" + dictionary.get(i + 2).getTranscription() + "\t" + dictionary.get(i + 3).getTranscription());
            System.out.println(dictionary.get(i).getTranslation() + "\t" + dictionary.get(i + 1).getTranslation() + "\t" + dictionary.get(i + 2).getTranslation() + "\t" + dictionary.get(i + 3).getTranslation());
            System.out.println();
        }
    }

    public static void printPerFourWithout(ArrayList<Dictionary> dictionary) {
        for (int i = 0; i < dictionary.size() - 3; i = i + 3) {
            System.out.println(dictionary.get(i).getWord() + "\t\t" + dictionary.get(i + 1).getWord() + "\t\t" + dictionary.get(i + 2).getWord() + "\t\t" + dictionary.get(i + 3).getWord());
            System.out.println(dictionary.get(i).getTranslation() + "\t" + dictionary.get(i + 1).getTranslation() + "\t" + dictionary.get(i + 2).getTranslation() + "\t" + dictionary.get(i + 3).getTranslation());
            System.out.println();
        }
    }
    public static void learnedWords(ArrayList<Dictionary> dictionary, ArrayList<Dictionary> learned, int i){
        learned.add(dictionary.get(i));
        dictionary.remove(i);
        System.out.println("++++++++++++++");
        System.out.println(learned);
        System.out.println("++++++++++++++");
    }

    public static void printSize(ArrayList<Dictionary> d){
        System.out.println("There are " + d.size() + " word(s) in the vocabulary.");
    }
    public static void findWord(ArrayList<Dictionary> dictionary, ArrayList<Dictionary> learned, String s){
        for (Dictionary d: dictionary) {
            if(d.getWord().equals(s) || d.getTranslation().equals(s)){
                System.out.println(d.getWord() + " is in the dictionary");
            }
        }
        for (Dictionary l: learned) {
            if(l.getWord().equals(s) || l.getTranslation().equals(s)){
                System.out.println(l.getWord() + " learned");
            }
        }
    }
}
