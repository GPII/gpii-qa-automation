package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base implements Config {
    Screen screen = new Screen();

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void setUp() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/HTMLreport.html");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setReportName("Functional report");
        htmlReporter.config().setDocumentTitle("Automation report");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Hostname", "Windows");
        // Minimize all active windows on the machine because can be clicked other buttons on the screen
        screen.type("d", KeyModifier.WIN);
        System.out.println(screen.getScreen());
        System.out.println(screen.getNumberScreens());
        System.out.println(screen.isOtherScreen());


    }

    @AfterClass
    public void tearDown() {
        extent.flush();
    }
}
