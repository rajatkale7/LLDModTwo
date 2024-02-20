package factory;

import factory.components.button.Button;
import factory.components.dropdown.Dropdown;
import factory.components.menu.Menu;

public class Main {
    public static void main(String[] args){
        /*
        Flutter fb=new Flutter(SupportedPlatforms.IOS);
        UIFactory fac= new AndroidFactory();  //Do not let client need to create factory
        Menu m= fac.createMenu();
        Dropdown d= fac.createDropdown();
        Button b= fac.createButton();

        If we debug the above piece of code then we will see that
        we passed IOS platform but we got android components

         */
        Flutter f= new Flutter(SupportedPlatforms.IOS);
        UIFactory fac= f.createUIfactory();
        Menu m= fac.createMenu();
        Dropdown d= fac.createDropdown();
        Button b= fac.createButton();

    }
}
