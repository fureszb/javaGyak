package model;

public class Szemely {

    private String nev;
    private int eletkor;

    public Szemely(String nev, int eletkor) throws IskolaException {
        this.nev = nev;
        setEletkor(eletkor);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) throws IskolaException {
        if (eletkor < 6) {
            throw new IskolaException("Az életkor nem lehet kevesebb, mint 6.");
        }
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return "Név: " + nev + ", Életkor: " + eletkor;
    }

}
