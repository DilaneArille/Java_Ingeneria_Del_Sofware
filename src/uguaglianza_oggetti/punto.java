package uguaglianza_oggetti;

/**
* Classe Punto: Rappresenta un punto in un piano 2D con coordinate x e y.
* 
* Questa classe ci servirà per dimostrare la differenza tra:
*   - Identità (==) : È lo STESSO oggetto in memoria?
*   - Equivalenza (.equals()) : DUE oggetti diversi hanno lo STESSO valore?
*/
public class punto {

 // -----------------------------------------------------------------
 // 1. LO STATO (Campi d'istanza / Attributi)
 // -----------------------------------------------------------------
 
 // 'private' significa che queste variabili sono accessibili solo dall'interno di questa classe.
 // È una buona pratica di incapsulamento.
 private int x; // La coordinata orizzontale (ascissa)
 private int y; // La coordinata verticale (ordinata)

 // -----------------------------------------------------------------
 // 2. IL COSTRUTTORE (Per creare gli oggetti)
 // -----------------------------------------------------------------
 
 // Il costruttore è un metodo speciale che ha lo stesso nome della classe.
 // Viene chiamato automaticamente quando si usa la parola chiave 'new'.
 // Serve a inizializzare lo stato dell'oggetto.
 public punto(int x, int y) {
     // 'this.x' si riferisce all'attributo della classe.
     // 'x' (senza this) si riferisce al parametro passato come argomento.
     this.x = x; // Assegniamo il valore del parametro x all'attributo x
     this.y = y; // Assegniamo il valore del parametro y all'attributo y
 }

 // -----------------------------------------------------------------
 // 3. I GETTER (Per leggere i valori privati)
 // -----------------------------------------------------------------
 
 // Dato che x e y sono 'private', non possiamo leggerli direttamente dall'esterno.
 // Forniamo dei metodi pubblici per accedervi in lettura.
 public int getX() {
     return x; // Restituisce il valore attuale di x
 }

 public int getY() {
     return y; // Restituisce il valore attuale di y
 }

 // -----------------------------------------------------------------
 // 4. IL METODO EQUALS (Il cuore della lezione!)
 // -----------------------------------------------------------------
 
 // Di default, Java confronta gli indirizzi di memoria (come ==).
 // Per confrontare il CONTENUTO, dobbiamo "sovrascrivere" (override) questo metodo.
 // @Override è un'annotazione che verifica che stiamo effettivamente sovrascrivendo un metodo esistente.
 @Override
 public boolean equals(Object obj) {
     
     // PASSO 1: Verificare se è lo stesso oggetto in memoria.
     // 'this' si riferisce all'oggetto attuale (quello che chiama equals).
     // Se 'this == obj', allora è sicuramente lo stesso oggetto, restituiamo true immediatamente.
     // Questa è un'ottimizzazione (evitiamo di confrontare i campi inutilmente).
     if (this == obj) return true;
     
     // PASSO 2: Verificare se l'oggetto passato è null.
     // Se obj è null, non può essere uguale al nostro oggetto (che non è null).
     if (obj == null) return false;
     
     // PASSO 3: Verificare se l'oggetto passato è dello stesso tipo (Punto).
     // Se confrontiamo un Punto con una String, non sono la stessa cosa.
     // getClass() restituisce la classe dell'oggetto.
     if (getClass() != obj.getClass()) return false;
     
     // PASSO 4: Confrontare i valori (il contenuto).
     // Facciamo un "cast" di obj a Punto per poter accedere ai suoi campi x e y.
     punto altro = (punto) obj;
     
     // Restituiamo true SOLO SE x e y sono uguali in entrambi gli oggetti.
     // 'this.x == altro.x' confronta gli interi (== funziona bene per i primitivi).
     return this.x == altro.x && this.y == altro.y;
 }
}
