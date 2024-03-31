/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Area_Funcional;
import Logica_Negocio.Empresa;
import Logica_Negocio.Fecha;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class HelperImpresion {
    public static void MostrarDetalleEmpresa(Empresa objEmpresa)
    {
         
        ArrayList<Persona> listapersonas= objEmpresa.getLista_Personas();
     
        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("\n"+ "Persona No: "+"\t"+ (i+1));
            System.out.println("Nombre: "+"\t"+ listapersonas.get(i).getNombre());
            System.out.println("Identificacion: "+"\t"+ listapersonas.get(i).getId_persona());
            Fecha objFecha= listapersonas.get(i).getObjFecha();
            System.out.println("Fecha de nacimiento: "+"\t"+ objFecha.getDia()+"/" +objFecha.getMes() +"/" +objFecha.getAño() +"\n");
        }
        ArrayList<Area_Funcional> listaareas= objEmpresa.getLista_AreaFuncional();
        for (int i = 0; i < listaareas.size(); i++) {
            System.out.println("Area No: "+"\t"+ listaareas.get(i).getNoArea());
            System.out.println("Tipo de area: "+"\t"+ listaareas.get(i).getNom_AF());
            for (int j = 0; j < listaareas.get(i).getLista_Computadores().size(); j++) {
                System.out.println("Marca Computador: "+"\t"+ listaareas.get(i).getLista_Computadores().get(j).getMarca());
                System.out.println("Modelo Computador: "+"\t"+ listaareas.get(i).getLista_Computadores().get(j).getModelo());
                System.out.println("Id computador: "+"\t"+ listaareas.get(i).getLista_Computadores().get(j).getId_cp()+"\n");
            }
           
        }
    }
}
