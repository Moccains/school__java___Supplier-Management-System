package org.project.menus;

import org.project.system.SystemFunctions;
import org.project.system.preload_functions.Resource_Lang;

import java.util.Scanner;

public class Menu_Login implements SystemFunctions {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMenu() {
        // Locks the user in a while loop so the "continue" keyword can be used to bring the user back to the top
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println(Resource_Lang.lang_login.getProperty("headerText"));
            System.out.println(Resource_Lang.lang_login.getProperty("login_username_text"));
            System.out.print(" > "); String usernameInput = scanner.nextLine();
            System.out.println(Resource_Lang.lang_login.getProperty("login_password_text"));
            System.out.print(" > "); String passwordInput = scanner.nextLine();
        }
    }
}
