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
}
