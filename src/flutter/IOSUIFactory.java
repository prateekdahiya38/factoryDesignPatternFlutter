package flutter;

import flutter.components.button.Buttons;
import flutter.components.button.IOSButton;
import flutter.components.dropdown.DropDown;
import flutter.components.dropdown.IOSDropDown;
import flutter.components.menu.IOSMenu;
import flutter.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Buttons createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
