package org.project.menus;

import org.project.system.Constants;
import org.project.system.SystemFunctions;
import org.project.system.preload_functions.Resource_Lang;

import java.util.Scanner;

public class Menu_Main implements SystemFunctions {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMenu() {
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println(Resource_Lang.lang_login.getProperty("headerText"));
            System.out.print(" > ");
            if (inputHandler()) break;

        }
    }
    private static boolean inputHandler() {
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "1" : { // Login Menu
                SystemFunctions.changeMenu(Constants.MenuIDS.LOGIN);
                return true;
            }
            case "3" : { // Exit Program
                SystemFunctions.terminateProgram();
                return true;
            }
        }
        return false;
    }

}
