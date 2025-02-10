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

import java.util.Scanner;

public class UseProdotto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Televisore televisore = new Televisore("LGsmartTV", "LG", 800.80F, 22, "55_pollici" , true);
        Smartphone smartphone = new Smartphone("Smartphone", "Samsung A55", 480.00F, 22, 155);
        Cuffie cuffie = new Cuffie("cuffie", "Philips", 35.00F, 22, "nero", false);
        
        System.out.println("Il primo prodotto è una TV "+televisore.getNome()+", la marca è "+televisore.getMarca()+", il prezzo è €"+televisore.getPrezzo()+", l'va da applicare è "+televisore.getIva()+", le dimensioni sono "+televisore.getDimensioni()+", smart "+televisore.isSmart()+", codice prodotto: "+televisore.generateCod());
        System.out.println("Il secondo prodotto è uno "+smartphone.getNome()+", la marca è "+smartphone.getMarca()+", il prezzo è €"+smartphone.getPrezzo()+", l'va da applicare è "+smartphone.getIva()+", la memoria è di "+smartphone.getMemoria()+" GB, codice IMEI "+smartphone.generateImeiCod()+", codice prodotto: "+smartphone.generateCod());
        System.out.println("Il terzo prodotto sono delle "+cuffie.getNome()+", la marca è "+cuffie.getMarca()+", il prezzo è €"+cuffie.getPrezzo()+", l'va da applicare è "+cuffie.getIva()+", il colore è "+cuffie.getColore()+", wireless "+cuffie.isWireless()+", codice prodotto: "+cuffie.generateCod());
    }
}
