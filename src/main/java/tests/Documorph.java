//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class Documorph extends Base implements Config {
//    @Test
//    public void documorph() throws FindFailed {
//        if (screen.exists(stripTaskManager,5) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH ONE - Check Documorph");
//
//        test.createNode("Click Documorph on strip menu");
//        try {
//            screen.exists(stripDocumorph, timeout);
//            screen.click(stripDocumorph);
//        } catch (Exception e) {
//            test.fail("Launch Documorph icon on strip menu is not found");
//        }
//        test.createNode("Check Documorph is opened");
//        try {
//            screen.exists(documorph, timeout);
//        } catch (Exception e) {
//            test.fail("Launch Notepad is not found");
//        }
//        test.createNode("Close Documorph ");
//        try {
//            screen.exists(closeDocumorph, timeout);
//            screen.click(closeDocumorph);
//        } catch (Exception e) {
//            test.fail("Documorph close button is not found");
//        }
//    }
//}
