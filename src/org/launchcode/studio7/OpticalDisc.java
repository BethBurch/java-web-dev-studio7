package org.launchcode.studio7;



import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public interface OpticalDisc {
    Map<String, Integer> CAPACITIES = new HashMap<>() {{
        put("CD", 700);
        put("DVD", 17000);
    }};

    Map<String, Integer> SPEEDS = new HashMap<>() {{
        put("CD", 400);
        put("DVD", 1200);
    }};

    void spinDisc();

    void readData();

    void runFile(File file);

    void writeData(File file);

}
