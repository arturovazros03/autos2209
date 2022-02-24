package holamundo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisyuyots
 */
public class Persona {
    //atributos de la clase persona
     private String nombre;
     private int edad;
     
     //metodo constructor  "crtl+espacio" 
    public Persona() {
    }

     //metodo constructor sobrecargado "crtl + espacio"
    public Persona(String nombre, int edad ) {
        this.nombre = nombre;
        this.edad = edad;
    }
     
    //metodos de uso general click derecho 
    //luego "insert code" y "getter and setter"

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //metodo de la clase persona 
    public void Comer(String platillo){
        System.out.println(this.nombre+" esta comiendo "+ platillo);
                
    }
}
