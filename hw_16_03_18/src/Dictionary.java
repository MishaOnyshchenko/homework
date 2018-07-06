public class Dictionary {
    private String word;
    private String transcription;
    private String translation;

    public Dictionary() {
    }

    public Dictionary(String word, String transcription, String translation) {
        this.word = word;
        this.transcription = transcription;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String getTranscription() {
        return transcription;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionary that = (Dictionary) o;
        return Objects.equals(word, that.word) &&
                Objects.equals(transcription, that.transcription) &&
                Objects.equals(translation, that.translation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, transcription, translation);
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "word = '" + word + '\'' +
                ", transcription = '" + transcription + '\'' +
                ", translation = '" + translation + '\'' +
                '}';
    }
}
