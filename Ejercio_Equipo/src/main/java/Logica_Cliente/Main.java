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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
      Jugador objugador1= new Jugador("Jan ","Oblak","1","Arquero",1);
        Jugador objugador2= new Jugador("Jose ","Gimenez","2","Defensa",2);
        Jugador objugador3= new Jugador("Diego ","Godin","3","Defensa",3);
        Jugador objugador4= new Jugador("Juan Fran ","Torres","4","Lateral Derecho",4);
        Jugador objugador5= new Jugador("Filipe ","Luis","5","Lateral Izquierdo",5);
        Jugador objugador6= new Jugador("Jorge ","Resureccion","6","Volante",6);
        Jugador objugador7= new Jugador("Antoine ","Griezzman","7","Volante",7);
        Jugador objugador8= new Jugador("Yannick ","Carrasco","8","Volante",8);
        Jugador objugador9= new Jugador("Saul ","Ñigez","9","Volante",11);
        Jugador objugador10= new Jugador("Diego ","Costa","10","Delantero",19);
        Jugador objugador11= new Jugador("Radamel ","Falcao","11","Delantero",9);
       
        ArrayList<Jugador> listaequipo = new ArrayList<>();
       
        listaequipo.add(objugador1);
        listaequipo.add(objugador2);
        listaequipo.add(objugador3);
        listaequipo.add(objugador4);
        listaequipo.add(objugador5);
        listaequipo.add(objugador6);
        listaequipo.add(objugador7);
        listaequipo.add(objugador8);
        listaequipo.add(objugador9);
        listaequipo.add(objugador10);
        listaequipo.add(objugador11);
       
        //no usamos el constructor en la asociacion solo set 
        Equipo objquiEquipo = new Equipo("Atletico Madrid", listaequipo); //Agregacion
        //la asociciacion se hace con set
       
        HelperImpresion.ImprimirInfoLocal(objquiEquipo);
    }
    
}
