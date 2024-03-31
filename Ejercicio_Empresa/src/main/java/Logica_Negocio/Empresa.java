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
public class Empresa {
    public String Nit;
    public ArrayList Lista_Personas;
    public ArrayList Lista_AreaFuncional;

    public Empresa() {
    }

    public Empresa(String Nit, ArrayList Lista_Personas, ArrayList Lista_AreaFuncional) {
        this.Nit = Nit;
        this.Lista_Personas = Lista_Personas;
        this.Lista_AreaFuncional = Lista_AreaFuncional;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public void setLista_Personas(ArrayList Lista_Personas) {
        this.Lista_Personas = Lista_Personas;
    }

    public void setLista_AreaFuncional(ArrayList Lista_AreaFuncional) {
        this.Lista_AreaFuncional = Lista_AreaFuncional;
    }

    public String getNit() {
        return Nit;
    }

    public ArrayList getLista_Personas() {
        return Lista_Personas;
    }

    public ArrayList getLista_AreaFuncional() {
        return Lista_AreaFuncional;
    }
    
    
}
