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
    Pattern finishButton = new Pattern(Path + "finish_button.png");
    Pattern accept = new Pattern(Path + "accept.png");
    Pattern installButton = new Pattern(Path + "install_button.png");
    Pattern nextButtonInstall = new Pattern(Path + "next_button_install.png");
    Pattern stripLanguage = new Pattern(Path + "strip_language.png");
    Pattern hoverLanguage = new Pattern(Path + "hover_language.png");
    Pattern helpMoreOptions= new Pattern(Path + "help_more_options.png");
    Pattern helplearnMore= new Pattern(Path + "help_learn_more.png");
    Pattern changeLanguageUrl= new Pattern(Path + "change_language_url.png");
    Pattern closeIE = new Pattern(Path + "close_IE.png");


    Pattern stripScreenZoom= new Pattern(Path + "strip_screen_zoom.png");
    Pattern hoverScreenZoom= new Pattern(Path + "hover_screen_zoom.png");
    Pattern screenZoomURL= new Pattern(Path + "screen_zoom_url.png");

}
