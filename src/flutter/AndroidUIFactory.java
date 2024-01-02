package flutter;

import flutter.components.button.AndroidButton;
import flutter.components.button.Buttons;
import flutter.components.dropdown.AndroidDropDown;
import flutter.components.dropdown.DropDown;
import flutter.components.menu.AndroidMenu;
import flutter.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Buttons createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
