//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class ChromeReadAloud extends Base implements Config {
//    @Test
//    public void chromeReadAloud() throws FindFailed {
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH Two - Test Chrome Read Aloud");
//        test.createNode("Hover mouse over Chrome Read Aloud button");
//        try {
//            screen.exists(stripChromeReadAloud.similar(0.8), 2);
//            screen.hover(stripChromeReadAloud);
//
//        } catch (Exception e) {
//            test.fail("Chrome Read Aloud icon on strip menu is not found");
//        }
//        try {
//            screen.exists(hoverChromeReadAloud);
//        } catch (Exception e) {
//            test.fail("Hover is not found");
//        }
//        test.createNode("Click on Help & More button");
//        try {
//            screen.click(stripChromeReadAloud);
//            screen.wait(helpMoreOptions.similar(0.8), timeout);
//            screen.click(helpMoreOptions, timeout);
//        } catch (Exception e) {
//            test.fail("Help & more options is not found.");
//        }
//        test.createNode("Click on Help and More options button.");
//        try {
//            screen.wait(helplearnMore, timeout);
//            screen.click(helplearnMore, timeout);
//        } catch (Exception e) {
//            test.fail("Help and Learn More button is not found.");
//        }
//
//        test.createNode("Open IE");
//        try {
//            screen.exists(openIE, timeout);
//            screen.click(openIE);
//        } catch (Exception e) {
//            test.fail("IE icon is not found");
//        }
//        test.createNode("Morphic webpage is opened with information for Chrome Read Aloud.");
//        try {
//            screen.exists(url, timeout);
//        } catch (Exception e) {
//            test.fail("Morphic webpage is not found.");
//        }
//        test.createNode("Close IE ");
//        try {
//            screen.exists(closeIE, timeout);
//            screen.click(closeIE);
//        } catch (Exception e) {
//            test.fail("IE is not found");
//        }
//    }
//}
