/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Computador;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="";
        int id=0;
        String marca="";
        
        //creacion del objeto
        Computador objcomputador =new Computador ();
        
        //importando una utilidad en clase java 
         Scanner scan = new Scanner(System.in) ;
         
        //output
        System.out.println("Digete el nombre del computador ");
        nombre =scan.nextLine();
        objcomputador.setNombre(nombre);
        
         System.out.println("Digete el id del computador ");
        id =scan.nextInt();
        objcomputador.setId(id);
        
         System.out.println("Digete la marca del computador ");
        marca =scan.nextLine();
        objcomputador.setMarca(marca);
        
        //mostrando los resultados
        System.out.println("El nombre del computador es:"+ objcomputador.getNombre());
        System.out.println("El id del computador es:"+ objcomputador.getId());      
        System.out.println("la marca del computador es:"+ objcomputador.getMarca());
    
    }
}
