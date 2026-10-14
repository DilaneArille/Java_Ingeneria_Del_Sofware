package Objets_Class_Idioms_Base_java;


public class TestCircle {

    public static void main(String[] args) {
        
        System.out.println("--- Test della classe Circle ---");
        
        // Création d'objet (Creazione dell'oggetto)
        // Circle c; riserva solo la memoria per un riferimento (inizializzato a null)
        // L'oggetto reale viene istanziato dinamicamente sullo Heap tramite 'new', che chiama il costruttore.
        Circle c = new Circle(0.0, 0.0, 2.0);
        
        // Appel des méthodes (Chiamata ai metodi)
        double areaCalcolata = c.area();
        
        // Stampa del risultato come richiesto dall'immagine
        System.out.println("Area del cerchio: " + areaCalcolata); // Affiche ~12.56636
        
        // (Opzionale) Testiamo anche la circonferenza per completezza
        double circonferenzaCalcolata = c.circumference();
        System.out.println("Circonferenza: " + circonferenzaCalcolata);
    }
}
