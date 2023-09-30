/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Alumno
 */
public class Punto {
       private double coordenadaX;
    private double coordenadaY;
    
    //Constructor 

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    
    
    // Metodo

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    public static void main(String[] args) {
        
        Punto punto1 = new Punto(3, 2);
        
        System.out.println ("La coordenada X es: " + punto1.getCoordenadaX());
        
        System.out.println ("La coordenada Y es: " + punto1.getCoordenadaY());
    }

} 

