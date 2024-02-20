package factory;
public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms){
        switch (supportedPlatforms){
            case IOS: return new IOSFactory();
            case ANDROID: return new AndroidFactory();
            //If new platform comes, we can add it here So, OCP is followed in FLutter.
            //And using if else here is a part of business logic so, OCP violated here still in greyzone.
        }
        return null;
    }
}
