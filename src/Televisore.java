public class Televisore extends Prodotto{

    public String dimensioni;

    public boolean smart;

    public Televisore(String nome, String marca, float prezzo, float iva, String dimensioni, boolean smart){
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }
    

}
