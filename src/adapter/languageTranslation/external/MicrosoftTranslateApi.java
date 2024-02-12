package adapter.languageTranslation.external;
import static adapter.languageTranslation.external.ApiUtils.logMicrosoftGetSupportedLanguages;
import static adapter.languageTranslation.external.ApiUtils.logMicrosoftTranslate;
import java.util.List;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
