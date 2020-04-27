package tests;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class Install extends Base implements Config {
    @Test
    public void install() throws FindFailed {
        test = extent.createTest("Install Morphic");

        test.createNode("Click Morphic icon");
        try {
            screen.exists(morphicIcon, timeout);
            screen.doubleClick(morphicIcon);
        } catch (Exception e) {
            test.fail("Morphic icon on desktop is not found");
        }

        test.createNode("Click next button");
        try {
            screen.exists(nextButtonInstall.similar(0.9), timeout);
            screen.click(nextButtonInstall);
        } catch (Exception e) {
            test.fail("Next button is not found");
        }
        test.createNode("Accept Terms and Conditions");
        try {
            screen.exists(accept, timeout);
            screen.click(accept);
        } catch (Exception e) {
            test.fail("Accept is not found");
        }
        test.createNode("Click next button");
        try {
            screen.exists(nextButton, timeout);
            screen.click(nextButton);
        } catch (Exception e) {
            test.fail("Next button is not found");
        }
        test.createNode("Click install button");
        try {
            screen.exists(installButton, timeout);
            screen.click(installButton);
        } catch (Exception e) {
            test.fail("Install button is not found");
        }
        test.createNode("Click finish button");
        if (screen.exists(finishButton.similar(0.9), 600) != null) {
            screen.click(finishButton);
        } else {
            test.fail("Finish button is not found");
        }

    }

}
