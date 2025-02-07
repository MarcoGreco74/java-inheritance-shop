public class Cuffie extends Prodotto{
    
    public String colore;

    public boolean wireless;

    public Cuffie(String nome, String marca, float prezzo, float iva, String colore, boolean wireless){
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }
}
