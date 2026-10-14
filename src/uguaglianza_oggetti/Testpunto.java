package uguaglianza_oggetti;

//Dichiarazione del package (deve essere lo stesso di Punto.java)


/**
* Classe di test per dimostrare la differenza tra == e .equals().
*/
public class Testpunto {

 // Punto di ingresso del programma (il metodo main viene eseguito all'avvio)
 public static void main(String[] args) {
     
     // Stampa di un titolo per la console
     System.out.println("==================================================");
     System.out.println(" IDENTITÀ (==) vs UGUAGLIANZA DI CONTENUTO (.equals()) ");
     System.out.println("==================================================\n");

     // -----------------------------------------------------------------
     // CASO 1: Due variabili che puntano allo STESSO oggetto
     // -----------------------------------------------------------------
     System.out.println("--- CASO 1: Stesso oggetto (p2 = p1) ---");
     
     // 'new Punto(10, 20)' crea un nuovo oggetto in memoria (sullo Heap).
     // La variabile 'p1' contiene l'indirizzo di memoria di questo oggetto.
     punto p1 = new punto(10, 20);
     
     // 'p2 = p1' copia l'indirizzo di memoria di p1 in p2.
     // Ora, p1 e p2 puntano allo STESSO oggetto.
     punto p2 = p1; 
     
     // 'p1 == p2' confronta gli indirizzi di memoria.
     // Dato che entrambe le variabili contengono lo stesso indirizzo, è true.
     System.out.println("p1 == p2      ? " + (p1 == p2));      // Stampa true
     
     // 'p1.equals(p2)' confronta il contenuto.
     // Dato che è lo stesso oggetto, il contenuto è per forza identico: true.
     System.out.println("p1.equals(p2) ? " + p1.equals(p2)); // Stampa true
     System.out.println(); // Riga vuota per spaziare

     // -----------------------------------------------------------------
     // CASO 2: Due oggetti DIVERSI con lo STESSO contenuto
     // -----------------------------------------------------------------
     System.out.println("--- CASO 2: Oggetti diversi, stesso contenuto ---");
     
     // Creiamo un NUOVO oggetto p3 con le coordinate (10, 20).
     punto p3 = new punto(10, 20);
     
     
    
     
     // Creiamo ANCORA un altro oggetto p4 con le STESSE coordinate (10, 20).
     // Attenzione: p3 e p4 sono due oggetti distinti in memoria!
     punto p4 = new punto(10, 20); 
     
     // 'p3 == p4' confronta gli indirizzi di memoria.
     // Dato che sono due oggetti creati separatamente, gli indirizzi sono diversi: false.
     System.out.println("p3 == p4      ? " + (p3 == p4));      // Stampa false
     
     // 'p3.equals(p4)' confronta il contenuto (grazie al nostro metodo equals).
     // Le coordinate sono identiche (10 e 20), quindi è true.
     System.out.println("p3.equals(p4) ? " + p3.equals(p4)); // Stampa true
     System.out.println();

     // -----------------------------------------------------------------
     // CASO 3: Due oggetti DIVERSI con contenuto DIVERSO
     // -----------------------------------------------------------------
     System.out.println("--- CASO 3: Oggetti diversi, contenuto diverso ---");
     
     // Creiamo un oggetto p5 con (10, 20)
     punto p5 = new punto(10, 20);
     
     // Creiamo un oggetto p6 con (99, 99) -> coordinate diverse!
     punto p6 = new punto(99, 99);
     
     // 'p5 == p6' confronta gli indirizzi: false (oggetti diversi)
     System.out.println("p5 == p6      ? " + (p5 == p6));      // Stampa false
     
     // 'p5.equals(p6)' confronta il contenuto: false (10 != 99 e 20 != 99)
     System.out.println("p5.equals(p6) ? " + p5.equals(p6)); // Stampa false
     System.out.println();

     // -----------------------------------------------------------------
     // CONCLUSIONE
     // -----------------------------------------------------------------
     System.out.println("==================================================");
     System.out.println(" CONCLUSIONE ");
     System.out.println("==================================================");
     // == verifica se è lo stesso oggetto (stesso indirizzo di memoria)
     System.out.println("Usa == per verificare se è lo STESSO oggetto.");
     // .equals() verifica se gli oggetti hanno lo stesso valore (stesso contenuto)
     System.out.println("Usa .equals() per verificare se gli oggetti hanno lo STESSO VALORE.");
     
     boolean sameReference = (p1== p2);
     
     System.out.println("boolean sameReference = (p1 == p2);"); 
     System.out.println("risultato:"+sameReference+"//falso sono due ogetti distinti in memoria");
     System.out.println();
     
     
     boolean sameContent = p1.equals(p2);
     
     System.out.println("boolean sameContent = p1.equals(p2);");
     System.out.println("Risultato: " + sameContent + "  // TRUE: hanno lo stesso stato/testo");
     System.out.println();
 }
}
