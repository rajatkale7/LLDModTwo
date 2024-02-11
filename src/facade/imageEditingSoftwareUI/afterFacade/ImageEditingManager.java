package facade.imageEditingSoftwareUI.afterFacade;
import facade.imageEditingSoftwareUI.services.*;

public class ImageEditingManager {
    private ImageEditingFacade facade;
    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.facade= new ImageEditingFacade(imageLoader,filterService, imageModifier, imageWriter, analyticsService);
    }
    public void editImage(String imagePath, String filterType, int brightness) {
        facade.editAndSaveImage(imagePath, filterType, brightness);
    }
}
