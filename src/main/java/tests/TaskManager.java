package tests;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class TaskManager extends Base implements Config {
    @Test()
    public void taskManager() throws FindFailed {

        if (screen.exists(stripTaskManager) == null) {
            screen.click(trayIcon);
        }
        test = extent.createTest("Check Task Manager");

        test.createNode("Click Task Manager");
        try {
            // Click on Task Manager icon
            screen.exists(stripTaskManager, timeout);
            screen.click(stripTaskManager);
        } catch (Exception e) {
            test.fail("Task Manager icon on strip menu is not found");
        }
        try {
            // Task manager is opened
            screen.exists(taskManager, timeout);
        } catch (Exception e) {
            test.fail("Task Manager icon is not found");
        }
        try {
            // Close Task manager
            screen.exists(xTaskManager, timeout);
            screen.click(xTaskManager);
        } catch (Exception e) {
            test.fail("Task manager close button is not found");
        }
    }
}
