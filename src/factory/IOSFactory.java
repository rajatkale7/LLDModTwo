package factory;

import factory.components.button.Button;
import factory.components.button.IosButton;
import factory.components.dropdown.Dropdown;
import factory.components.dropdown.IosDropdown;
import factory.components.menu.IosMenu;
import factory.components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
