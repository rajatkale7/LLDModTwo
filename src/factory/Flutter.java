package factory;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setTheme(){
        System.out.println("Theme is being set");
    }

    public void setRefreshRate(){
        System.out.println("Refresh rate is being set");
    }

    public UIFactory createUIfactory(){
        //Version-2:
//        if(supportedPlatforms.equals(supportedPlatforms.IOS)){
//            return new IOSFactory();
//        }
//        else {
//            return new AndroidFactory();
//        }

        //But if Mac is added as a supported platform then OCP violation happens
        //To do this we will have a hack.

        //Below is the neat code so that we need not to make changes here if Mac platform comes into role
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
