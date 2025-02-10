public class Cuffie extends Prodotto{
    
    private String colore;

    private boolean wireless;

    public Cuffie(String nome, String marca, float prezzo, float iva, String colore, boolean wireless){
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    

}
