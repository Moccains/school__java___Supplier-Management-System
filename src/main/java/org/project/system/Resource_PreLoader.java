package org.project.system;

import org.project.system.preload_functions.Resource_Lang;

public class Resource_PreLoader {
    public static void executeTask() {
        Resource_Lang.loadLanguages();
    }
}
