// Dichiarazione del package (deve essere lo stesso di Circle.java)
package parola_chiave_this;

public class TestCircle1 {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DIMOSTRAZIONE DI 'this' e 'this()' ");
        System.out.println("==================================================\n");

        // -----------------------------------------------------------------
        // TEST 1: Costruttore principale (con tutti i parametri)
        // -----------------------------------------------------------------
        System.out.println("--- TEST 1: Costruttore principale ---");
        
        // Creiamo un cerchio con centro (5.0, 10.0) e raggio 2.0.
        // Chiamiamo il costruttore Circle(double x, double y, double r).
        Circle1 c1 = new Circle1(5.0, 10.0, 2.0);
        
        // Stampiamo i valori per verificare che 'this.x = x' abbia funzionato.
        System.out.println("Cerchio c1 -> x: " + c1.x + ", y: " + c1.y + ", r: " + c1.r);
        System.out.println();

        // -----------------------------------------------------------------
        // TEST 2: Costruttore sovraccarico (solo raggio) con this()
        // -----------------------------------------------------------------
        System.out.println("--- TEST 2: Costruttore con solo raggio (usa this()) ---");
        
        // Creiamo un cerchio passando SOLO il raggio (3.0).
        // Questo chiamerà il costruttore Circle(double r), che a sua volta
        // chiamerà this(0.0, 0.0, r) per impostare il centro nell'origine.
        Circle1 c2 = new Circle1(3.0);
        
        // Verifichiamo: x e y devono essere 0.0, r deve essere 3.01.
        System.out.println("Cerchio c2 -> x: " + c2.x + ", y: " + c2.y + ", r: " + c2.r);
        System.out.println();

        // -----------------------------------------------------------------
        // TEST 3: Costruttore di copia con this()
        // -----------------------------------------------------------------
        System.out.println("--- TEST 3: Costruttore di copia (usa this()) ---");
        
        // Creiamo una copia esatta di c1 (che aveva x=5.0, y=10.0, r=2.0).
        // Chiamiamo il costruttore Circle(Circle c), che a sua volta
        // chiamerà this(c.x, c.y, c.r) per copiare i valori.
        Circle1 c3 = new Circle1(c1);
        
        // Verifichiamo: c3 deve avere gli stessi valori di c1.
        System.out.println("Cerchio c3 -> x: " + c3.x + ", y: " + c3.y + ", r: " + c3.r);
        System.out.println();

        System.out.println("==================================================");
        System.out.println(" CONCLUSIONE ");
        System.out.println("==================================================");
        System.out.println("'this.x = x' serve a distinguere l'attributo dal parametro.");
        System.out.println("'this(...)' serve a chiamare un altro costruttore ed evitare duplicazione.");
        System.out.println("'this(...)' deve essere SEMPRE la prima istruzione del costruttore.");
    }
}



