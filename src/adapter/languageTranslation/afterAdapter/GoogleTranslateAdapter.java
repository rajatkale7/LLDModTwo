package adapter.languageTranslation.afterAdapter;
import adapter.languageTranslation.external.*;
import java.util.List;

public class GoogleTranslateAdapter implements TranslationProviderAdapter{
    private GoogleTranslateApi googleApi = new GoogleTranslateApi();

    public String translate(TranslationRequest request) {
        GoogleTranslationRequest googleRequest =
                new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(),
                        request.getTargetLanguage(), request.getConfidenceThreshold());
        return googleApi.convert(googleRequest);
    }

    public List<String> getSupportedLanguages() {
        return googleApi.getLanguages();
    }
}
