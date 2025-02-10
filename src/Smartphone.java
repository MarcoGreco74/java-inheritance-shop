public class Smartphone extends Prodotto {
private long imeiCode;

    private int memoria;

    public Smartphone(String nome, String marca, float prezzo, float iva, int memoria){
        super(nome, marca, prezzo, iva);
        this.memoria = memoria;
    }

    public String generateImeiCod(){
        long codiceRandom = (long)(Math.random()*100000000);
        String imei = "Imei-";
        String codiceImei = imei+codiceRandom;
        return codiceImei;
    }

    public long getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(long imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    } 

    
}
