public class Smartphone extends Prodotto {

    public long imeiCode;

    public int memoria;

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
}
