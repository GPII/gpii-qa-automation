package tests;

import org.sikuli.script.Pattern;


public interface Config {
    Integer timeout = 60;
    String Path = System.getProperty("user.dir") + "\\images\\";
    Pattern trayIcon = new Pattern(Path + "tray_icon.png");
    Pattern stripTaskManager = new Pattern(Path + "strip_task_manager.png");
    Pattern xTaskManager = new Pattern(Path + "x_task_manager.png");
    Pattern taskManager = new Pattern(Path + "task_manager.png");

}
