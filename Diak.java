package model;

public class Diak extends Szemely {

    private double atlag;

     public Diak(String nev, int eletkor, double atlag) throws IskolaException {
        super(nev, eletkor);
        this.atlag = atlag;
    }
    
    public void rendezzAtlag(){
        
    }

}
