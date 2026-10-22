public class M2_esercizi {
    public static void main(String[] args) throws Exception {
        /*
        In questo caso posso scrivere su più righe.
        Questo è un commento.
        Il metodo println può essere inserito velocemente scrivendo sout
         */
        System.out.println("Hello, World!");
        // se inserisco \n il testo va a capo
        System.out.println("Questa è la prima riga\nQuesta è la seconda riga\nQuesta è la terza riga");        
        
        saluta();
    }

    /**
     * Saluta una persona di nome Andrea.
     * @throws Exception Descrizione del comportamento nel caso in cui il metodo non funzioni.
     */
    public static void saluta() throws Exception {
        System.out.println("Ciao Andrea!");
    }
}
