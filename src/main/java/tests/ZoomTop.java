//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class ZoomTop extends Base implements Config{
//    @Test
//    public void zoomTopWindow() throws FindFailed {
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        test = extent.createTest("BATCH Two - Test Zoom Top Window");
//        test.createNode("Hover mouse over Screen Zoom button");
//        try {
//            screen.exists(stripZoomTop.similar(0.8),2);
//            screen.hover(stripZoomTop);
//
//        } catch (Exception e) {
//            test.fail("Zoom Top Window icon on strip menu is not found");
//        }
//        try {
//            screen.exists(hoverZoomTop);
//        }
//        catch (Exception e){
//            test.fail("Hover is not found");
//        }
//        test.createNode("Click on Help & More button");
//        try {
//            screen.click(stripZoomTop);
//            screen.wait(helpMoreOptions.similar(0.8),timeout);
//            screen.click(helpMoreOptions, timeout);
//        } catch (Exception e) {
//            test.fail("Help & more options is not found.");
//        }
//        test.createNode("Click on Help and More options button.");
//        try {
//            screen.wait(helplearnMore,timeout);
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
//        test.createNode("Morphic webpage is opened with information for zoom top window.");
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
