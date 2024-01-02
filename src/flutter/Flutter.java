package flutter;

public class Flutter {
private Platforms platform;

    public Flutter(Platforms platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(){
        return UIFactFactory.createUIFactory(this.platform);
    }
}
