/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Llanta {
    public String Tamaño;
    public String Marca;

    public Llanta() {
    }

    public Llanta(String Tamaño, String Marca) {
        this.Tamaño = Tamaño;
        this.Marca = Marca;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getMarca() {
        return Marca;
    }
    
    
}
