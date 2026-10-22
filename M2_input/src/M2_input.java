/*
Scrivi la classe CartaIdentita che dichiara e inizializza, con i tuoi dati reali, una variabile per
il nome, una per il cognome, una per l'anno di nascita, una per l'altezza in metri, una per l'ini‐
ziale del tuo cognome e una che dica se sei iscritto al corso di informatica. Scegli per ciascuna
il tipo più adatto e dai nomi che rispettino le convenzioni del linguaggio. Dichiara inoltre una
costante con l'anno scolastico corrente e usala per calcolare l'età che compirai nell'anno in
corso.
Il programma stampa una riga per ogni informazione, con un'etichetta che la descrive.
Dati: i tuoi dati personali, scritti direttamente nel programma.
Output atteso, con dati di esempio:
MODULO M2 — ESERCIZI LABORATORIO DI INFORMATICA — 3BI

2

Nome: Giulia
Cognome: Bertelli
Iniziale del cognome: B
Anno di nascita: 2011
Eta' compiuta nel 2026: 15
Altezza: 1.64 m
Iscritto al corso di informatica: true
 */
import java.util.Scanner;

public class M2_input {
    public static void main(String[] args) throws Exception {
        // 1. Creo un oggetto che chiamerò tastiera di tipo Scanner
        // tastiera è una istanza della classe Scanner: in altre parole si può
        // dire che tastiera è un oggetto (istanza della classe Scanner).
        // Un oggetto deve essere creato
        
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        
        int a;
        int b;
        
        // output per cominicare cosa fa il programma
        System.out.println("Calcolo della somma di due variabili");
        
        // operazione di output: prompt
        System.out.print("a: ");
        // operazione di input
        a = tastiera.nextInt();
        // operazione di output: prompt
        System.out.print("b: ");
        // operazione di input
        b = tastiera.nextInt();

        System.out.println("La somma di a + b = " + (a + b));

        // chiudo la connessione con la tastiera
        tastiera.close();                
    }
}
