package adapter.languageTranslation.external;
//Scaler used lombok here. @AllArgsConstructor and @Getter
public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;
}
