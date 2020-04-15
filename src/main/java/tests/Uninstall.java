package tests;

import org.testng.annotations.Test;

public class Uninstall extends Base implements Config{
    @Test
    public void uninstall() {
        test = extent.createTest("Uninstall Morphic");
        test.createNode("Click Morphic icon");
        try {
            screen.exists(morphicIcon, timeout);
            screen.doubleClick(morphicIcon);
        } catch (Exception e) {
            test.fail("Morphic icon on desktop is not found");
        }

        test.createNode("Click next button");
        try {
            screen.exists(nextButton.similar(0.9), timeout);
            screen.click(nextButton);
        } catch (Exception e) {
            test.fail("Next button is not found");
        }
        test.createNode("Click remove button");
        try {
            screen.exists(removeButton, timeout);
            screen.click(removeButton);
        } catch (Exception e) {
            test.fail("Remove button is not found");
        }
        test.createNode("Click remove with icon button");
        try {
            screen.exists(removeButtonWithIcon, timeout);
            screen.click(removeButtonWithIcon);
        } catch (Exception e) {
            test.fail("Remove button with icon is not found");
        }
        test.createNode("Click finish button");
        try {
            screen.wait(finishButton.similar(0.9), 600);
            screen.exists(finishButton, timeout);
            screen.click(finishButton);
        } catch (Exception e) {
            test.fail("Finish button is not found");
        }
    }
}
