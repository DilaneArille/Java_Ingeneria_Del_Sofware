package Objets_Class_Idioms_Base_java;


//Source: JavaBasicsAndIdioms22.pdf, p. 10, 11
public class Circle {
 
 // Champs d'instance (Etat / Stato)
 // Questi sono gli attributi che definiscono la posizione e la dimensione del cerchio
 public double x, y;
 public double r;

 // Constructeur d'initialisation (Costruttore)
 // Serve per creare l'oggetto e assegnare i valori iniziali
 public Circle(double xCenter, double yCenter, double radius) {
     x = xCenter;
     y = yCenter;
     r = radius;
 }

 // Méthodes d'instance (Comportement / Comportamento)
 
 // Calcola la circonferenza del cerchio (2 * PI greco * raggio)
 public double circumference() {
     return 2 * 3.14159 * r;
 }

 // Calcola l'area del cerchio (PI greco * raggio^2)
 public double area() {
     return 3.14159 * r * r;
 }
}