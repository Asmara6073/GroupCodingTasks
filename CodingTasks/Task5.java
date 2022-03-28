package Group.CodingTasks;

public class Task5 {
}

interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{

    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Google chrome browser has been opened");
    }

    @Override
    public void close() {
        System.out.println("Google chrome browser has been closed");
    }

    @Override
    public String getTitle() {
        return "Google";
    }

    @Override
    public void getScreenShot() {
        System.out.println("Screen shot taken on chrome");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to new page on chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Firefox browser has been opened");
    }

    @Override
    public void close() {
        System.out.println("Firefox browser has been closed");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenShot() {
        System.out.println("Screen shot taken on firefox");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to new page on firefox");
    }
}

class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Safari browser has been opened");
    }

    @Override
    public void close() {
        System.out.println("Safari browser has been closed");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenShot() {
        System.out.println("Screen shot taken on Safari");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to new page on safari");
    }

}
