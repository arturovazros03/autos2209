/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.conceptos;

import java.awt.Color;

/**
 *
 * @author luisyuyots
 */
public class Automovil {
    //atributos
    private String marca;
    private String subMarca;
    private int modelo;
    private Color color;

    //constructor por defecto
    public Automovil() {
    }
    //constructor por defecto
    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    //comportamiento (metodos)
public void encender(){
    System.out.println("El auto "+this.subMarca+" esta encendido");
            
}    

public void acelerar(){
    System.out.println("Acelerando el auto "+this.subMarca);
}
   
public void avanzar(){
    System.out.println("Avanzando el auto");
}
}
