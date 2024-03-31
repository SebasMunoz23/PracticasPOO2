/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Equipo;
import Logica_Negocio.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        ArrayList<Jugador> listaequipo = new ArrayList<>();
        
        String nombreJugador="";
        String apellidoJugador="";
        String id="";
        String posicionJugador="";
        int num_CamisaJugador=0;
        
        String nomEquipo="";
        
        System.out.println("Ingrese la cantidad de jugadores que quiere en el equipo ");
        int numJugadores=scan.nextInt();
        
        for (int i = 0; i < numJugadores; i++) {
            scan.nextLine();
            
            System.out.println("Ingrese el nombre del jugador: "+(i+1));
            nombreJugador=scan.nextLine();
            
            System.out.println("Ingrese el apellido del jugador: "+(i+1));
            apellidoJugador=scan.nextLine();
            
            System.out.println("Ingrese el id del jugador: "+(i+1));
            id=scan.nextLine();
            
            System.out.println("Ingrese la posicion del jugador: "+(i+1));
            posicionJugador=scan.nextLine();
            
            System.out.println("Ingrese el numero de camiseta del jugador: "+(i+1));
            num_CamisaJugador=scan.nextInt();
            
            Jugador objugador =new Jugador (nombreJugador, apellidoJugador, id, posicionJugador, num_CamisaJugador);
            listaequipo.add(objugador);
        }
        System.out.println("Ingrese el nombre del equipo: ");
        nomEquipo=scan.nextLine();
        
        //se crea la AGREGACION para eso creamos un obj de la otra clase y le añadimos la lista de la otra clase
        Equipo objequipo =new Equipo(nomEquipo, listaequipo);
        
       HelperImpresion.ImprimirInfoLocal(objequipo);
    }
    
}
