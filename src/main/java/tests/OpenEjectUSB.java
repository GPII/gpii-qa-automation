//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class OpenEjectUSB extends Base implements Config {
//    @Test
//    public void openEjectUSB() throws FindFailed {
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH Two - Test Open Eject USB files");
//        test.createNode("Hover mouse over Open Eject USB of Menus button");
//        try {
//            screen.exists(stripOpenEjectUSB,2);
//            screen.hover(stripOpenEjectUSB);
//
//        } catch (Exception e) {
//            test.fail("Open Eject USB icon on strip menu is not found");
//        }
//        try {
//            screen.exists(hoverOpenEjectUSB);
//        }
//        catch (Exception e){
//            test.fail("Hover is not found");
//        }
//        test.createNode("Click on Help & More options");
//        try {
//            screen.click(stripOpenEjectUSB);
//            screen.wait(helpMoreOptions.similar(0.8));
//            screen.click(helpMoreOptions);
//        } catch (Exception e) {
//            test.fail("Help & more options is not found.");
//        }
//
//        test.createNode("Click on Help and Learn More button.");
//        try {
//            screen.wait(helplearnMore,timeout);
//            screen.click(helplearnMore, timeout);
//        } catch (Exception e) {
//            test.fail("Help and Learn More button is not found.");
//        }
//        test.createNode("Open IE");
//        try {
//            screen.exists(openIE, timeout);
//            screen.click(openIE);
//        } catch (Exception e) {
//            test.fail("IE icon is not found");
//        }
//        test.createNode("Morphic webpage is opened with information for Open Eject USB.");
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
