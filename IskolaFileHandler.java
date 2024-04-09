package model;

import java.io.*;
import java.util.*;

public class IskolaFileHandler implements FileHandler {

    @Override
    public void mentes(String fajlNev, List<?> objektumok) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fajlNev))) {
            oos.writeObject(objektumok);
        } catch (IOException e) {
            throw new IOException("Hiba történt a mentés során: " + e.getMessage());
        }
    }

    @Override
    public List<?> betoltes(String fajlNev) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fajlNev))) {
            return (List<Szemely>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }
}
