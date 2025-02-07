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
        
        System.out.println("Il primo prodotto è una TV "+televisore.nome+", la marca è "+televisore.marca+", il prezzo è €"+televisore.prezzo+", l'va da applicare è "+televisore.iva+", le dimensioni sono "+televisore.dimensioni+", smart "+televisore.smart+", codice prodotto: "+televisore.generateCod());
        System.out.println("Il secondo prodotto è uno "+smartphone.nome+", la marca è "+smartphone.marca+", il prezzo è €"+smartphone.prezzo+", l'va da applicare è "+smartphone.iva+", la memoria è di "+smartphone.memoria+" GB, codice IMEI "+smartphone.generateImeiCod()+", codice prodotto: "+smartphone.generateCod());
        System.out.println("Il terzo prodotto sono delle "+cuffie.nome+", la marca è "+cuffie.marca+", il prezzo è €"+cuffie.prezzo+", l'va da applicare è "+cuffie.iva+", il colore è "+cuffie.colore+", wireless "+cuffie.wireless+", codice prodotto: "+cuffie.generateCod());
    }
}
