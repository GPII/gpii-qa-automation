//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class QuickFolder extends Base implements Config {
//    @Test
//    public void quickFolder() throws FindFailed {
//
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("Check Open Quick Folder");
//
//        test.createNode("Click Open Quick Folder on strip menu");
//        try {
//            screen.exists(stripQuickFolder, timeout);
//            screen.click(stripQuickFolder);
//        } catch (Exception e) {
//            test.fail("Open Quick Folder icon on strip menu is not found");
//        }
//        test.createNode("Open IE");
//        try {
//            screen.exists(openIE, timeout);
//            screen.click(openIE);
//        } catch (Exception e) {
//            test.fail("IE icon is not found");
//        }
//        test.createNode("Check My Google Drive is opened");
//        try {
//            screen.exists(quickFolder, timeout);
//        } catch (Exception e) {
//            test.fail("Launch Open Quick Folder is not found");
//        }
//        test.createNode("Close My One Drive ");
//        try {
//            screen.exists(closeIE, timeout);
//            screen.click(closeIE);
//        } catch (Exception e) {
//            test.fail("My One Drive close button is not found");
//        }
//    }
//}
