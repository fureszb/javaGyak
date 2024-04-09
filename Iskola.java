/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fures
 */
public class Iskola {

    private List<Diak> diakok;
    private List<Tanar> tanarok;
    private FileHandler fileHandler;

    public Iskola() {
        diakok = new ArrayList<>();
        tanarok = new ArrayList<>();
        fileHandler = new IskolaFileHandler();
    }

    public <T> void kiirLista(List<T> lista) {
        for (T elem : lista) {
            System.out.println(elem);
        }
    }
    
    


    // Itt kerülnek implementálásra a fájlba írás/olvasás és a kollekciók használata...
    public void addDiak(Diak diak) {
        diakok.add(diak);
    }

    public void addTanar(Tanar tanar) {
        tanarok.add(tanar);
    }

    public void mentesDiakok(String fajlNev) {
        try {
            fileHandler.mentes(fajlNev, diakok);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void betoltesDiakok(String fajlNev) {
        try {
            diakok = (List<Diak>) fileHandler.betoltes(fajlNev);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
