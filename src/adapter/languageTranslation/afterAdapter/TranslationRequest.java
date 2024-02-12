package adapter.languageTranslation.afterAdapter;

public class TranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }


    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setConfidenceThreshold(double number) {
        this.confidenceThreshold = number;
    }

    public Double getConfidenceThreshold() {
        return this.confidenceThreshold;
    }
}
