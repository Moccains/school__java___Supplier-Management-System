package org.project;

import org.project.system.MenuHandler;
import org.project.system.Resource_PreLoader;

public class MainApp {
    public static void main(String[] args) {

        // Stage 1: Pre-Loading assets
        Resource_PreLoader.executeTask();

        // Stage 2: Start the program
        MenuHandler.loadMenu();
    }
}
