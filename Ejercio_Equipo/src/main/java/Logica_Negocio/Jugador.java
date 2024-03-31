/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Jugador {
    public String Nombre;
    public String Apellido;
    public String Id;
    public String Posicion;
    public int Numero_Camisa;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String Id, String Posicion, int Numero_Camisa) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Id = Id;
        this.Posicion = Posicion;
        this.Numero_Camisa = Numero_Camisa;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public void setNumero_Camisa(int Numero_Camisa) {
        this.Numero_Camisa = Numero_Camisa;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getId() {
        return Id;
    }

    public String getPosicion() {
        return Posicion;
    }

    public int getNumero_Camisa() {
        return Numero_Camisa;
    }
    
    
    
}
