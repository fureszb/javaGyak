package model;

import java.io.IOException;
import java.util.List;

public interface FileHandler {

    void mentes(String fajlNev, List<?> objektumok) throws IOException;

    List<?> betoltes(String fajlNev) throws IOException, ClassNotFoundException;
}
