/*
Nel progetto java-inheritance-shop creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” 
per fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
*/
public class Prodotto {

    public String nome;

    public String marca;

    public float prezzo;

    public float iva;

    public Prodotto(String nome, String marca, float prezzo, float iva){
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public String generateCod(){
        int codiceRandom = (int)(Math.random()*1000);
        String codiceProdotto = codiceRandom+"_"+this.nome;
        return codiceProdotto;
    } 
    
}
