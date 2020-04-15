package tests;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class ChangeLanguage extends Base {
    @Test
    public void changeLanguage() throws FindFailed {
        if (screen.exists(stripTaskManager) == null) {
            screen.click(trayIcon,3);
        }
        test = extent.createTest("BATCH Two - Test Language of Menus");
        test.createNode("Hover mouse over Change Language of Menus button");
        try {
            screen.exists(stripLanguage.similar(0.8),2);
            screen.hover(stripLanguage);

        } catch (Exception e) {
            test.fail("Language of Menus icon on strip menu is not found");
        }
        try {
            screen.exists(hoverLanguage,3);
        }
        catch (Exception e){
            test.fail("Hover is not found");
        }
        test.createNode("Click Language on strip");
        try {
            screen.exists(stripLanguage, 3);
            screen.click(stripLanguage);
        } catch (Exception e) {
            test.fail("Language on strip is not found.");
        }
        test.createNode("Click on Help & More options");
        try {
            screen.exists(helpMoreOptions);
            screen.click(helpMoreOptions);
        } catch (Exception e) {
            test.fail("Help & more options is not found.");
        }

        test.createNode("Click on Help and Learn More button.");
        try {
            screen.exists(helplearnMore,timeout);
            screen.click(helplearnMore, timeout);
        } catch (Exception e) {
            test.fail("Help and Learn More button is not found.");
        }
        test.createNode("Morphic webpage is opened with information for Change Language.");
        try {
            screen.exists(changeLanguageUrl, timeout);
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
    }
}
