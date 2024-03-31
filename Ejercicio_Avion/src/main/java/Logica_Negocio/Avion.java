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
public class Avion {
    public String Marca;
    public ArrayList<Motor> Lista_motor;
    public ArrayList<Llanta> Lista_llanta;
    public ArrayList<Ala> Lista_alas;
    public Fuselaje objFuselaje;

    public Avion() {
    }

    public Avion(String Marca, ArrayList<Motor> Lista_motor, ArrayList<Llanta> Lista_llanta, ArrayList<Ala> Lista_alas, Fuselaje objFuselaje) {
        this.Marca = Marca;
        this.Lista_motor = Lista_motor;
        this.Lista_llanta = Lista_llanta;
        this.Lista_alas = Lista_alas;
        this.objFuselaje = objFuselaje;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setLista_motor(ArrayList<Motor> Lista_motor) {
        this.Lista_motor = Lista_motor;
    }

    public void setLista_llanta(ArrayList<Llanta> Lista_llanta) {
        this.Lista_llanta = Lista_llanta;
    }

    public void setLista_alas(ArrayList<Ala> Lista_alas) {
        this.Lista_alas = Lista_alas;
    }

    public void setObjFuselaje(Fuselaje objFuselaje) {
        this.objFuselaje = objFuselaje;
    }

    public String getMarca() {
        return Marca;
    }

    public ArrayList<Motor> getLista_motor() {
        return Lista_motor;
    }

    public ArrayList<Llanta> getLista_llanta() {
        return Lista_llanta;
    }

    public ArrayList<Ala> getLista_alas() {
        return Lista_alas;
    }

    public Fuselaje getObjFuselaje() {
        return objFuselaje;
    }

   

  
    
    
}
