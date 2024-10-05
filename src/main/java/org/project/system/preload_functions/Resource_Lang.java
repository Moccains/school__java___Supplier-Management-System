package org.project.system.preload_functions;

import java.io.InputStream;
import java.util.Properties;

public class Resource_Lang {
    public static Properties lang_main = new Properties();
    public static Properties lang_login = new Properties(); // Login Data

    public static void loadLanguages() {
        loadLanguageFile(lang_main, "/locale_en/menu_main.properties");
        loadLanguageFile(lang_login, "/locale_en/menu_login.properties");
    }

    /**
     * Why make this? The amount of try catch blocks is going to be excessive
     * due to the amount of .properties files that are going to be added.<br>
     * <br>
     * The core purpose of this function is to easily hook a Properties file to its object
     */
    private static void loadLanguageFile(Properties variable, String filePath) {
        try {
            InputStream resourceStream = Resource_Lang.class.getResourceAsStream(filePath);
            variable.load(resourceStream);
        } catch (Exception e) {
            System.out.println("Error loading lang file located at : "+filePath);
        }
    }
}
