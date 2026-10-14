

//Dichiarazione del package (la cartella virtuale in cui si trova questo file)
package parola_chiave_this;

/**
* Classe Circle: Rappresenta un cerchio con coordinate x, y e raggio r.
* 
* Questa classe dimostra l'uso di:
*   1. 'this' per distinguere attributi e parametri con lo stesso nome.
*   2. 'this()' per chiamare un costruttore da un altro costruttore.
*/
public class Circle1 {

 // -----------------------------------------------------------------
 // 1. LO STATO (Campi d'istanza / Attributi)
 // -----------------------------------------------------------------
 
 // 'public' significa che queste variabili sono accessibili da qualsiasi classe.
 // (Normalmente si userebbe 'private', ma seguiamo l'esempio del corso).
 public double x; // Coordinata x del centro
 public double y; // Coordinata y del centro
 public double r; // Raggio del cerchio

 // -----------------------------------------------------------------
 // 2. COSTRUTTORE PRINCIPALE (Quello "completo")
 // -----------------------------------------------------------------
 
 // Questo costruttore richiede tutti e tre i parametri per creare un cerchio.
 // È il costruttore "base" che gli altri richiameranno.
 public Circle1(double x, double y, double r) {
     
     // USO DI 'this' (Riferimento all'istanza corrente):
     // C'è ambiguità! Il parametro si chiama 'x' e anche l'attributo si chiama 'x'.
     // 'this.x' si riferisce all'ATTRIBUTO della classe (il campo d'istanza).
     // 'x' (senza this) si riferisce al PARAMETRO locale passato al costruttore.
     // Questa riga dice: "Assegna il valore del parametro x all'attributo x di QUESTO oggetto".
     this.x = x; 
     
     // Stessa cosa per y: 'this.y' è l'attributo, 'y' è il parametro.
     this.y = y; 
     
     // Stessa cosa per r: 'this.r' è l'attributo, 'r' è il parametro.
     this.r = r; 
 }

 // -----------------------------------------------------------------
 // 3. COSTRUTTORE SURCHARGÉ (Sovraccarico) con this()
 // -----------------------------------------------------------------
 
 // Questo costruttore accetta SOLO il raggio.
 // Serve a creare un cerchio con centro nell'origine (0,0).
 public Circle1(double r) {
     
     // USO DI 'this()' (Chiamata al costruttore):
     // Invece di riscrivere 'this.x = 0.0; this.y = 0.0; this.r = r;',
     // chiamiamo il costruttore principale passandogli i valori di default (0.0, 0.0).
     
     // ⚠ REGOLA FERREA: 'this(...)' DEVE essere la PRIMA istruzione del costruttore!
     // Se mettiamo qualsiasi altra riga di codice prima, Eclipse darà errore.
     this(0.0, 0.0, r); 
 }

 // -----------------------------------------------------------------
 // 4. COSTRUTTORE DI COPIA (Copy Constructor)
 // -----------------------------------------------------------------
 
 // Questo costruttore prende un altro oggetto Circle come parametro.
 // Serve a creare una copia esatta di un cerchio esistente.
 public Circle1(Circle1 c) {
     
     // Anche qui usiamo 'this()' per delegare al costruttore principale.
     // Prendiamo i valori (x, y, r) dall'oggetto 'c' passato come parametro
     // e li passiamo al costruttore principale.
     
     // Anche questa deve essere la PRIMA istruzione!
     this(c.x, c.y, c.r); 
 }
}
