package Class25HW;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElements();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is opened");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("chrome window is maximized");
    }

    @Override
    public void findElements() {
        System.out.println("Chrome is finding elements");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("firefox window is maximized");
    }

    @Override
    public void findElements() {
        System.out.println("Firefox is finding elements");
    }
}
class Main{
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver x: arr){
            x.openBrowser();
            x.closeBrowser();
            x.findElements();
            x.maximizeWindow();
        }
    }
}
