package tests;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class ScreenZoom  extends Base {
    @Test
    public void screenZoom() throws FindFailed {
        if (screen.exists(stripTaskManager) == null) {
            screen.click(trayIcon);
        }
        test = extent.createTest("BATCH Two - Test Screen Zoom");
        test.createNode("Hover mouse over Screen Zoom button");
        try {
            screen.exists(stripScreenZoom.similar(0.8),2);
            screen.hover(stripScreenZoom);

        } catch (Exception e) {
            test.fail("Screen Zoom icon on strip menu is not found");
        }
        try {
            screen.exists(hoverScreenZoom);
        }
        catch (Exception e){
            test.fail("Hover is not found");
        }
        test.createNode("Click on Help & More button");
        try {
            screen.click(stripScreenZoom);
            screen.wait(helpMoreOptions.similar(0.8),timeout);
            screen.click(helpMoreOptions, timeout);
        } catch (Exception e) {
            test.fail("Help & more options is not found.");
        }
        test.createNode("Click on Help and Learn More button.");
        try {
            screen.wait(helplearnMore,timeout);
            screen.click(helplearnMore, timeout);
        } catch (Exception e) {
            test.fail("Help and Learn More button is not found.");
        }

//        test.createNode("Open IE");
//        try {
//            screen.exists(ieIcon, timeout);
//            screen.click(ieIcon);
//        } catch (Exception e) {
//            test.fail("IE icon is not found");
//        }
//        test.createNode("Morphic webpage is opened with information for screen zoom.");
        try {
            screen.exists(screenZoomURL, timeout);
        } catch (Exception e) {
            test.fail("Morphic webpage is not found.");
        }
        test.createNode("Close IE ");
        try {
            screen.exists(closeIE, timeout);
            screen.click(closeIE);
        } catch (Exception e) {
            test.fail("IE is not found");
        }

//        test = extent.createTest("BATCH Four - Test decreasing window size with Screen Zoom Window");
//        test.createNode("Click on Screen Zoom button");
//        try {
//            screen.exists(stripScreenZoom,2);
//            screen.click(stripScreenZoom);
//
//        } catch (Exception e) {
//            test.fail("Screen Zoom icon on strip menu is not found");
//        }
//        test.createNode("Click on Smaller Zoom button");
//        try {
//            screen.exists(smallerZoom.similar(0.8),2);
//            screen.doubleClick(smallerZoom);
//
//        } catch (Exception e) {
//            test.fail("Smaller Zoom button is not found");
//        }
//        test.createNode("Verify Notification dialog");
//        try {
//            screen.exists(notificationDialog,2);
//            screen.click(notificationOK);
//
//        } catch (Exception e) {
//            test.fail("Notification dialog is not appear or button OK is not found");
//        }
//        test = extent.createTest("BATCH Four - Test increasing window size with Screen Zoom Window");
//        test.createNode("Click on Larger Screen Zoom button");
//        try {
//            screen.exists(largerZoom.similar(0.8),2);
//            screen.click(largerZoom);
//
//        } catch (Exception e) {
//            test.fail("Larger screen zoom button is not found");
//        }
//        test.createNode("Open File Explorer");
//        try {
//            screen.wait(fileExplorerIcon,20);
//            screen.exists(fileExplorerIcon,timeout);
//            screen.hover(fileExplorerIcon);
//            screen.click(fileExplorerIcon);
//
//        } catch (Exception e) {
//            test.fail("File Explorer is not found");
//        }
//        test.createNode("Verify File Explorer");
//        try {
//            screen.exists(fileExplorer,2);
//
//        } catch (Exception e) {
//            test.fail("File explorer is not found");
//        }
//        test.createNode("Close File Explorer");
//        try {
//            screen.exists(closeFileExplorer.similar(0.8),2);
//            screen.click(closeFileExplorer);
//
//        } catch (Exception e) {
//            test.fail("Close icon on File explorer is not found");
//        }
//
//        test.createNode("Open Google Chrome");d
//        try {
//            screen.exists(chromeIcon.similar(0.8),2);
//            screen.doubleClick(chromeIcon);
//
//        } catch (Exception e) {
//            test.fail("Google Chrome icon is not found");
//        }
//        test.createNode("Verify Google Chrome");
//        try {
//            screen.exists(forwardChromeIcon.similar(0.8),2);
//
//        } catch (Exception e) {
//            test.fail("Forward icon on Google Chrome is not found");
//        }
//        test.createNode("Close Google Chrome");
//        try {
//            screen.exists(closeChrome.similar(0.8),2);
//            screen.click(closeChrome);
//
//        } catch (Exception e) {
//            test.fail("Close icon on Google Chrome is not found");
//        }
//        test.createNode("Open morphic strip menu");
//        try{
//        if (screen.exists(stripTaskManager) == null) {
//            screen.click(trayIcon);
//        }
//        } catch (Exception e) {
//            test.fail("Morphic strip menu is not found");
//        }
//
//        test.createNode("Click on Screen Zoom button");
//        try {
//            screen.exists(stripScreenZoom,2);
//            screen.click(stripScreenZoom);
//
//        } catch (Exception e) {
//            test.fail("Screen Zoom icon on strip menu is not found");
//        }
//        test.createNode("Click on smaller icon");
//        try {
//            screen.exists(smallerZoom.similar(0.8),2);
//            screen.click(smallerZoom);
//
//        } catch (Exception e) {
//            test.fail("Smaller zoom button is not found");
//        }
//        test.createNode("Click on reset to standard Morphic");
//        try {
//            screen.exists(resetToStandard.similar(0.8),2);
//            screen.click(resetToStandard);
//
//        } catch (Exception e) {
//            test.fail("Reset to standard button is not found");
//        }
    }
}
