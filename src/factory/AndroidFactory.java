package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.dropdown.AndroidDropdown;
import factory.components.dropdown.Dropdown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
