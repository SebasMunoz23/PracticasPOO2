/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Avion;

/**
 *
 * @author ACER
 */
public class HelperImpresion {
    public static void ImprimirInfoLocal(Avion avion) {

        System.out.println("Marca del avion" + "\t" + avion.getMarca());
        System.out.println("Fuselaje del avion" + "\t" + avion.getObjFuselaje().getNombre());

        for (int i = 0; i < avion.getLista_alas().size(); i++) {

            System.out.println("Ala del avion" + "\t" + avion.getLista_alas().get(i).getPoscion());
            System.out.println("Ala del avion" + "\t" + avion.getLista_alas().get(i).getTamaño());
        }

        for (int i = 0; i < avion.getLista_llanta().size(); i++) {

            System.out.println("Llanta del avion" + "\t" + avion.getLista_llanta().get(i).getMarca());
            System.out.println("Llanta del avion" + "\t" + avion.getLista_llanta().get(i).getTamaño());
        }

        for (int i = 0; i < avion.getLista_motor().size(); i++) {

            System.out.println("Motor del avion" + "\t" + avion.getLista_motor().get(i).getRd_motor());
            System.out.println("Tamaño del avion" + "\t" + avion.getLista_motor().get(i).getTamaño());
            System.out.println("Motor del avion" + "\t" + avion.getLista_motor().get(i).getPosicion());
        }

    }
}
