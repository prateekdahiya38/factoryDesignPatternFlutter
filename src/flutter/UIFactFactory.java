package flutter;

public class UIFactFactory {

    public static UIFactory createUIFactory(Platforms platform){
        return switch(platform){
          case ANDROID -> new AndroidUIFactory();
          case IOS -> new IOSUIFactory();
          case WINDOWS -> new WindowsUIFactory();
        };
    }
}
