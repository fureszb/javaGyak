package model;

import java.util.HashSet;
import java.util.Set;

public class Tanar extends Szemely {

    public enum Tantargy {
        MATEMATIKA,
        IRODALOM,
        TORTENELEM,
        BIOLOGIA,
        FIZIKA,
        INFORMATIKA
    }

    private Set<Tantargy> tantargyak;

    public Tanar(String nev, int eletkor) throws IskolaException {
        super(nev, eletkor);
        this.tantargyak = new HashSet<>();
    }

    public void addTantargy(Tantargy tantargy) {
        tantargyak.add(tantargy);
    }

    public void removeTantargy(Tantargy tantargy) {
        tantargyak.remove(tantargy);
    }

    public Set<Tantargy> getTantargyak() {
        return tantargyak;
    }

}
