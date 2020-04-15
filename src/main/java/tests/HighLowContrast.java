//package tests;
//
//import org.sikuli.script.FindFailed;
//import org.testng.annotations.Test;
//
//public class HighLowContrast extends Base implements Config{
//    @Test
//    public void highLowContrast() throws FindFailed {
////        if (screen.exists(stripTaskManager) == null) {
////            screen.click(trayIcon);
////        }
////        test = extent.createTest("BATCH Two - Test High Low Contrast");
////        test.createNode("Hover mouse over High Low Contrast button");
////        try {
////            screen.exists(stripHighLowContrast.similar(0.8),2);
////            screen.hover(stripHighLowContrast);
////
////        } catch (Exception e) {
////            test.fail("High Low Contrast icon on strip menu is not found");
////        }
////        try {
////            screen.exists(hoverHighLowContrast);
////        }
////        catch (Exception e){
////            test.fail("Hover is not found");
////        }
////        test.createNode("Click on Help & More button");
////        try {
////            screen.click(stripHighLowContrast);
////            screen.wait(helpMoreOptions.similar(0.8),timeout);
////            screen.click(helpMoreOptions, timeout);
////        } catch (Exception e) {
////            test.fail("Help & more options is not found.");
////        }
////        test.createNode("Click on Help and More options button.");
////        try {
////            screen.wait(helplearnMore,timeout);
////            screen.click(helplearnMore, timeout);
////        } catch (Exception e) {
////            test.fail("Help and Learn More button is not found.");
////        }
////
////        test.createNode("Open IE");
////        try {
////            screen.exists(openIE, timeout);
////            screen.click(openIE);
////        } catch (Exception e) {
////            test.fail("IE icon is not found");
////        }
////        test.createNode("Morphic webpage is opened with information for High Low Contrast window.");
////        try {
////            screen.exists(url, timeout);
////        } catch (Exception e) {
////            test.fail("Morphic webpage is not found.");
////        }
////        test.createNode("Close IE ");
////        try {
////            screen.exists(closeIE, timeout);
////            screen.click(closeIE);
////        } catch (Exception e) {
////            test.fail("IE is not found");
////        }
//        test = extent.createTest("BATCH Four - Change High Low Contrast to black on white");
//        test.createNode("Click on High Low Contrast on strip menu");
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        try {
//            screen.exists(stripHighLowContrast,2);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on Black on white");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0,-60) ,timeout);
//        }
//        catch (Exception e){
//            test.fail("Black on white button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(blackOnWhiteTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("Black on white tray button is not found");
//        }
//        test = extent.createTest("BATCH Four - Change High Low Contrast to white on black");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,2);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on white on black");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0,-30));
//
//        }
//        catch (Exception e){
//            test.fail("White on black button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(whiteOnBlackTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("White on black tray button is not found");
//        }
//
//        test = extent.createTest("BATCH Four - Change High Low Contrast to yellow on black");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,2);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on white on black");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0 ,0));
//
//        }
//        catch (Exception e){
//            test.fail("Yellow on black button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(yellowOnBlackTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("Yellow on black tray button is not found");
//        }
//
//        test = extent.createTest("BATCH Four - Change High Low Contrast to black on yellow");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,2);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on white on black");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0,30));
//
//        }
//        catch (Exception e){
//            test.fail("Yellow on black button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(blackOnYellowTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("Yellow on black tray button is not found");
//        }
//
//        test = extent.createTest("BATCH Four - Change High Low Contrast to gray on white");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,2);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on gray on white");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0,60));
//
//        }
//        catch (Exception e){
//            test.fail("Gray on white button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(grayOnWhiteTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("Gray on white tray button is not found");
//        }
//
//
//        test = extent.createTest("BATCH Four - Change High Low Contrast to black on brown");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,timeout);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on black on brown");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0, 85));
//
//        }
//        catch (Exception e){
//            test.fail("Black on brown button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(blackOnBrownTray, timeout);
//        }
//        catch (Exception e){
//            test.fail("Black on brown tray button is not found");
//        }
//
//        test = extent.createTest("BATCH Four - Change High Low Contrast to regular contrast");
//        test.createNode("Click on High Low Contrast on strip menu");
//
//        try {
//            screen.exists(stripHighLowContrast,timeout);
//            screen.click(stripHighLowContrast);
//
//        } catch (Exception e) {
//            test.fail("High Low Contrast icon on strip menu is not found");
//        }
//        test.createNode("Click on regular contrast");
//        try {
//            screen.exists(highLowContrast, timeout);
//            screen.click(highLowContrast.targetOffset(0,-85));
//
//        }
//        catch (Exception e){
//            test.fail("Regular contrast button is not found");
//        }
//        test.createNode("Verify that theme is changed");
//        try {
//            screen.exists(trayIcon, timeout);
//        }
//        catch (Exception e){
//            test.fail("Tray icon is not found");
//        }
//    }
//}
