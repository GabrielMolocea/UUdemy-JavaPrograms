package com.gabrielmolocea;

import java.util.List;

public interface ISaveable {
    List<String> write();
    
    void red(List<String> saveValues);
}
