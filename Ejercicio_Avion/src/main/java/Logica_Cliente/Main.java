/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ala objala1= new Ala("Derecha", "Grande");
        Ala objala2= new Ala("Izquierda", "Grande");
       
        Motor objmotor1 = new Motor("Grande", "12345","Izquierda");
        Motor objmotor2 = new Motor("Grande", "56789","Derecha");
       
        Llanta llanta1 = new Llanta("Grande", "Michelin");
        Llanta llanta2 = new Llanta("Grande", "Michelin");
       
        Fuselaje objfuselaje = new Fuselaje("Reforzado");
       
       
        ArrayList<Ala> listaAlas= new ArrayList<>();
        ArrayList<Motor> listaMotor= new ArrayList<>();
        ArrayList<Llanta> listaLlantas= new ArrayList<>();
       
        listaAlas.add(objala1);
        listaAlas.add(objala2);
       
        listaMotor.add(objmotor1);
        listaMotor.add(objmotor2);
       
        listaLlantas.add(llanta1);
        listaLlantas.add(llanta2);
       
       
        Avion objavion = new Avion("Boeing 747",listaMotor, listaLlantas,listaAlas ,objfuselaje);
       
        HelperImpresion.ImprimirInfoLocal(objavion);
    }
    
}
