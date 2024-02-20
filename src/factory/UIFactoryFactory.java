package factory;
public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms){
        switch (supportedPlatforms){
            case IOS: return new IOSFactory();
            case ANDROID: return new AndroidFactory();
        }
        return null;
    }
}
