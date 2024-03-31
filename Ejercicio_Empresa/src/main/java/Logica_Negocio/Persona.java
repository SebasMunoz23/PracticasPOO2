/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Persona {
    public String Nombre;
    public String Id_persona;
    public Fecha objFecha; //atributo de tipo fecha

    public Persona() {
    }

    public Persona(String Nombre, String Id_persona, Fecha objFecha) {
        this.Nombre = Nombre;
        this.Id_persona = Id_persona;
        this.objFecha = objFecha;
    }
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setId_persona(String Id_persona) {
        this.Id_persona = Id_persona;
    }

    public void setObjFecha(Fecha objFecha) {
        this.objFecha = objFecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getId_persona() {
        return Id_persona;
    }

    public Fecha getObjFecha() {
        return objFecha;
    }
    
    
    
}
