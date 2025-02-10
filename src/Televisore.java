public class Televisore extends Prodotto{

    private String dimensioni;

    private boolean smart;

    public Televisore(String nome, String marca, float prezzo, float iva, String dimensioni, boolean smart){
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    
    
}
