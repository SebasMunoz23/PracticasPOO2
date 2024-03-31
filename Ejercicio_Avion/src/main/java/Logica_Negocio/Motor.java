/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Motor {
    public String Tamaño;
    public String Rd_motor;
    public String Posicion;

    public Motor() {
    }

    public Motor(String Tamaño, String Rd_motor, String Posicion) {
        this.Tamaño = Tamaño;
        this.Rd_motor = Rd_motor;
        this.Posicion = Posicion;
    }
    
    

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setRd_motor(String Rd_motor) {
        this.Rd_motor = Rd_motor;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getRd_motor() {
        return Rd_motor;
    }

    public String getPosicion() {
        return Posicion;
    }
    
    
}
