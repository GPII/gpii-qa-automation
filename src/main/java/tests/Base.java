package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Base implements Config {
    Screen screen = new Screen();
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
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
    }

    @AfterMethod
    public synchronized void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE)
            test.fail(result.getThrowable());
        else if (result.getStatus() == ITestResult.SKIP)
            test.skip(result.getThrowable());
        else
            test.pass("Test passed");

        extent.flush();
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
    }

}
