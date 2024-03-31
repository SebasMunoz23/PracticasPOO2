/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Computador {
    public String Marca;
    public String Modelo;
    public int id_cp;

    public Computador() {
    }

    
    
    public Computador(String Marca, String Modelo, int id_cp) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.id_cp = id_cp;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getId_cp() {
        return id_cp;
    }
    
    
    
}
