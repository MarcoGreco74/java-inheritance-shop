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
/*
Lavoriamo sulla stessa repo.
Nome repo: java-inheritance-shop
Nel progetto java-inheritance-shop create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti 
con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta 
dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe).
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {
        Televisore televisore = new Televisore("televisore", "LG", 800.80F, 22, "55_pollici", true);
        Smartphone smartphone = new Smartphone("smartphone", "Samsung A55", 480.00F, 22, 155);
        Cuffie cuffie = new Cuffie("cuffie", "Philips", 35.00F, 22, "nero", false);

        boolean controllo = false;

        String[] prodottiDisponibili = {"televisore", "cuffie", "smartphone"};

        ArrayList<String> carrello = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Che prodotto vuoi inserire nel carrello?");
        
        while(scan.hasNextLine()){ 
            String nameToCheck = scan.next();

            for(String s : prodottiDisponibili){
                if(nameToCheck.equals(s)){
                    controllo = true;
                }
            }
            if(controllo == true){
                    switch(nameToCheck) {
                        case "televisore" : carrello.add("Nome: "+televisore.getNome()+", marca: "+televisore.getMarca()+", prezzo: "+televisore.getPrezzo()+", iva: "+televisore.getIva()+", dimensioni: "+televisore.getDimensioni()+", smart: "+televisore.isSmart()+", codice prodotto: "+televisore.generateCod());
                        System.out.println("Il prodotto che hai inserito nel carrello è una TV "+televisore.getNome()+", la marca è "+televisore.getMarca()+", il prezzo è €"+televisore.getPrezzo()+", l'iva da applicare è "+televisore.getIva()+", le dimensioni sono "+televisore.getDimensioni()+", smart "+televisore.isSmart()+", codice prodotto: "+televisore.generateCod());
                        break;
                        case "smartphone" : carrello.add(smartphone.getNome()+", marca: "+smartphone.getMarca()+", prezzo: €"+smartphone.getPrezzo()+", iva: "+smartphone.getIva()+", memoria: "+smartphone.getMemoria()+" GB, codice IMEI "+smartphone.generateImeiCod()+", codice prodotto: "+smartphone.generateCod());
                        System.out.println("Il prodotto che hai inserito nel carrello è uno "+smartphone.getNome()+", la marca è "+smartphone.getMarca()+", il prezzo è €"+smartphone.getPrezzo()+", l'iva da applicare è "+smartphone.getIva()+", la memoria è di "+smartphone.getMemoria()+" GB, codice IMEI "+smartphone.generateImeiCod()+", codice prodotto: "+smartphone.generateCod());
                        break;
                        case "cuffie" : carrello.add("Nome: "+cuffie.getNome()+", marca: "+cuffie.getMarca()+", prezzo: €"+cuffie.getPrezzo()+", iva: "+cuffie.getIva()+", colore:  "+cuffie.getColore()+", wireless "+cuffie.isWireless()+", codice prodotto: "+cuffie.generateCod());
                        System.out.println("Il prodotto che hai inserito nel carrello sono delle "+cuffie.getNome()+", la marca è "+cuffie.getMarca()+", il prezzo è €"+cuffie.getPrezzo()+", l'iva da applicare è "+cuffie.getIva()+", il colore è "+cuffie.getColore()+", wireless "+cuffie.isWireless()+", codice prodotto: "+cuffie.generateCod());
                        break;
                        default : System.out.println("Prodotto non trovato");
                    }
                }else{
                    System.out.println("Prodotto non trovato");
                }
                System.out.println("Visualizza carrello : Y/N");
                String displayCarrello = scan.next();
                if(displayCarrello.equals("Y")){
                    System.out.println(Arrays.asList(carrello));
                    System.out.println("Che prodotto vuoi inserire nel carrello?");
                }else if(displayCarrello.equals("N")){
                    System.out.println("Che prodotto vuoi inserire nel carrello?");
                }
        }
        scan.close();
    }
}
