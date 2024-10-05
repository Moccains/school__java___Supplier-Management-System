package org.project.system;

import java.io.IOException;

public interface SystemFunctions {

    /**
     * Used for clearing console to make the experience cleaner despite
     * switching UIs
     */
    static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error clearing console");
        }
    }
    /**
     * Used to change the UI of the current program
     */
    static Constants.MenuIDS getCurrentMenu() {return SystemVariables.currentMenu;}

    static void changeMenu(Constants.MenuIDS menuID) {SystemVariables.currentMenu = menuID;}
    /**
     * Used for letting the heart of the program know if the program is still running
     */
    static boolean getProgramStatus() {return SystemVariables.isProgramRunning;}
    /**
     * Sets the boolean value of SystemVariables.system_status to false so when the program
     * is back at the heart of the program (MenuHandler.java), the program ends.
     */
    static void terminateProgram() {SystemVariables.isProgramRunning = false;}
}
