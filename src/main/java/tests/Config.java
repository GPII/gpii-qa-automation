package tests;

import org.sikuli.script.Pattern;


public interface Config {
    Integer timeout = 60;
    String Path = System.getProperty("user.dir") + "\\images\\";
    Pattern trayIcon = new Pattern(Path + "tray_icon.png");
    Pattern stripTaskManager = new Pattern(Path + "strip_task_manager.png");
    Pattern xTaskManager = new Pattern(Path + "x_task_manager.png");
    Pattern taskManager = new Pattern(Path + "task_manager.png");
    Pattern morphicIcon = new Pattern(Path + "morphic_icon.png");
    Pattern nextButton = new Pattern(Path + "next_button.png");
    Pattern removeButton = new Pattern(Path + "remove_button.png");
    Pattern removeButtonWithIcon = new Pattern(Path + "remove_button_with_icon.png");
    Pattern finishButton = new Pattern(Path + "finish_button.png");
    Pattern accept = new Pattern(Path + "accept.png");
    Pattern installButton = new Pattern(Path + "install_button.png");
    Pattern nextButtonInstall = new Pattern(Path + "next_button_install.png");

}
