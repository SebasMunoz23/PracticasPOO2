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
    public String nombre ;
    public int id;
    public String marca ;
    
    //constructor No parametrizado
    public Computador (){}
    
    //constructor  parametrizado

    public Computador(String nombre, int id, String marca) {
        this.nombre = nombre;
        this.id = id;
        this.marca = marca;
    }
    
    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //get

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }
    
}
