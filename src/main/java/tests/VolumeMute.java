//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class VolumeMute extends Base implements Config{
//    @Test
//    public void volumeMute() throws FindFailed {
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH Two - Test Volume&Mute");
//        test.createNode("Hover mouse over Volume&Mute of Menus button");
//        try {
//            screen.exists(stripVolumeMute,2);
//            screen.hover(stripVolumeMute);
//
//        } catch (Exception e) {
//            test.fail("Volume&Mute icon on strip menu is not found");
//        }
//        try {
//            screen.exists(hoverVolumeMute);
//        }
//        catch (Exception e){
//            test.fail("Hover is not found");
//        }
//        test.createNode("Click on Help & More options");
//        try {
//            screen.click(stripVolumeMute);
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
//        test.createNode("Morphic webpage is opened with information for Volume&Mute.");
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
