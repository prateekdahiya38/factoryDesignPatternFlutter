package flutter;

import flutter.components.button.Buttons;
import flutter.components.dropdown.DropDown;
import flutter.components.menu.Menu;



public interface UIFactory {
    Buttons createButton();
    Menu createMenu();
    DropDown createDropDown();
}
