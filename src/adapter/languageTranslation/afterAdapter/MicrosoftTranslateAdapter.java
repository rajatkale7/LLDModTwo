package adapter.languageTranslation.afterAdapter;
import adapter.languageTranslation.external.MicrosoftTranslateApi;
import java.util.List;

public class MicrosoftTranslateAdapter implements TranslationProviderAdapter{
    private MicrosoftTranslateApi microsoftApi = new MicrosoftTranslateApi();

    public String translate(TranslationRequest request) {
        return microsoftApi.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    public List<String> getSupportedLanguages() {
        return microsoftApi.getSupportedLanguages();
    }
}
