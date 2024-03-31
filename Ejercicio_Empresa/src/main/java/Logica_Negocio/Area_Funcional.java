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
public class Area_Funcional {
    public String Nom_AF;
    public int noArea;
    public ArrayList<Computador>Lista_Computadores;

    public Area_Funcional() {
    }

    public Area_Funcional(String Nom_AF, int noArea, ArrayList<Computador> Lista_Computadores) {
        this.Nom_AF = Nom_AF;
        this.noArea = noArea;
        this.Lista_Computadores = Lista_Computadores;
    }

    public void setNom_AF(String Nom_AF) {
        this.Nom_AF = Nom_AF;
    }

    public void setNoArea(int noArea) {
        this.noArea = noArea;
    }

    public void setLista_Computadores(ArrayList<Computador> Lista_Computadores) {
        this.Lista_Computadores = Lista_Computadores;
    }

    public String getNom_AF() {
        return Nom_AF;
    }

    public int getNoArea() {
        return noArea;
    }

    public ArrayList<Computador> getLista_Computadores() {
        return Lista_Computadores;
    }
    
    
}
