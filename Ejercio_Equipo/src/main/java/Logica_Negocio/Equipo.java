/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Equipo {
    public String Nombre;
    public ArrayList <Jugador> Lsjugadores;

    public Equipo() {
    }

    public Equipo(String Nombre, ArrayList<Jugador> Lsjugadores) {
        this.Nombre = Nombre;
        this.Lsjugadores = Lsjugadores;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setLsjugadores(ArrayList<Jugador> Lsjugadores) {
        this.Lsjugadores = Lsjugadores;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Jugador> getLsjugadores() {
        return Lsjugadores;
    }
    
    
    
}
