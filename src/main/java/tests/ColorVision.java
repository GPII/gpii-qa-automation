//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class ColorVision extends Base {
//    @Test
//    public void colorVision() throws FindFailed {
//        if (screen.exists(stripTaskManager,5) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH ONE - Check Color vision");
//
//        test.createNode("Hover Color Vision on strip menu");
//        try {
//            screen.exists(stripColorVision, timeout);
//            screen.hover(stripColorVision);
//            screen.exists(hoverColorVision,timeout);
//        } catch (Exception e) {
//            test.fail("Hover text on Color vision icon on strip menu is not found");
//        }
//
//        test.createNode("Click Color Vision on strip menu");
//        try {
//            screen.exists(stripColorVision, timeout);
//            screen.click(stripColorVision);
//        } catch (Exception e) {
//            test.fail("Color vision icon on strip menu is not found");
//        }
//        test.createNode("Check Color Vision is opened");
//        try {
//            screen.exists(colorVision, timeout);
//        } catch (Exception e) {
//            test.fail("Color vision is not found");
//        }
//        test.createNode("Click on Help & More options ");
//        try {
//            screen.exists(helpMore2, timeout);
//            screen.click(helpMore2);
//        } catch (Exception e) {
//            test.fail("Help & More options button is not found");
//        }
//        test.createNode("Click on Help Learn more ");
//        try {
//            screen.exists(helplearnMore, timeout);
//            screen.click(helplearnMore);
//        } catch (Exception e) {
//            test.fail("Help Learn more button is not found");
//        }
//        test.createNode("Click on IE button ");
//        try {
//            screen.exists(ttIE, timeout);
//            screen.click(ttIE);
//        } catch (Exception e) {
//            test.fail("IE button is not found");
//        }
//        test.createNode("Verify Color Vision url ");
//        try {
//            screen.exists(colorVisionURL, timeout);
//        } catch (Exception e) {
//            test.fail("Color vision url is not found");
//        }
//        test.createNode("Close IE");
//        try {
//            screen.exists(closeIE, timeout);
//            screen.click(closeIE);
//        } catch (Exception e) {
//            test.fail("Close button on IE is not found");
//        }
//    }
//}
