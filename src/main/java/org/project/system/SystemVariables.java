package org.project.system;

public class SystemVariables implements Constants {
    /**
     * This variable will handle what display the program would show
     * Default first page will always be the main page
     */
    public static Constants.MenuIDS currentMenu = MenuIDS.MAIN;
    /**
     * As long as this variable's value is true, the program will continue to run.<br>
     * This does not terminate the program instantly. The code has to be at MenuHandler.java for
     * this to actually kill the program if the value of this variable is false.
     */
    public static boolean isProgramRunning = true;
}
