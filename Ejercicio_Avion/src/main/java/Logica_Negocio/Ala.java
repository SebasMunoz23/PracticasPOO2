/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Ala {
    public String Poscion;
    public String Tamaño;

    public Ala() {
    }

    public Ala(String Poscion, String Tamaño) {
        this.Poscion = Poscion;
        this.Tamaño = Tamaño;
    }

    public void setPoscion(String Poscion) {
        this.Poscion = Poscion;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getPoscion() {
        return Poscion;
    }

    public String getTamaño() {
        return Tamaño;
    }
    
    
}
