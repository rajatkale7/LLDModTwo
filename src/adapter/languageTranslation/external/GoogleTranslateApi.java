package adapter.languageTranslation.external;
import static adapter.languageTranslation.external.ApiUtils.logGoogleTranslate;
import static adapter.languageTranslation.external.ApiUtils.logGoogleGetSupportedLanguages;
import java.util.*;

public class GoogleTranslateApi {
    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
