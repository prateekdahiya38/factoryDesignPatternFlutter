package flutter;

import flutter.components.button.Buttons;
import flutter.components.dropdown.DropDown;
import flutter.components.menu.Menu;


public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(Platforms.WINDOWS);
        UIFactory uifactory = flutter.createUIFactory();
        Menu menu = uifactory.createMenu();
        Buttons button = uifactory.createButton();
        DropDown dropdown = uifactory.createDropDown();

    }
}
