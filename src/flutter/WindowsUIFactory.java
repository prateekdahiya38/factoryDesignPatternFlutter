package flutter;

import flutter.components.button.Buttons;
import flutter.components.button.WindowsButton;
import flutter.components.dropdown.DropDown;
import flutter.components.dropdown.WindowsDropDown;
import flutter.components.menu.Menu;
import flutter.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Buttons createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
