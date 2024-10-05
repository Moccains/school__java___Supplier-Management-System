package org.project.system;

import org.project.menus.Menu_Login;
import org.project.menus.Menu_Main;

public class MenuHandler implements SystemFunctions, Constants {
    // The purpose of this method is to let the program know where to go next
    public static void loadMenu() {

        while (SystemFunctions.getProgramStatus()) {

            switch (SystemFunctions.getCurrentMenu()) {
                case MenuIDS.MAIN -> Menu_Main.displayMenu();
                case MenuIDS.LOGIN -> Menu_Login.displayMenu();

            }

        }

    }
}
