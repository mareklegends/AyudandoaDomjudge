/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudandoadomjudge;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioD { 
    
    
    public static void leerCasosPrueba(){
        Scanner leer = new Scanner(System.in);
        String caso = leer.nextLine();
        int numEquipos, numCasosPrueba;
        
        String aux[] = caso.split(" ");
        
        numEquipos = Integer.parseInt(aux[1]);
        numCasosPrueba = Integer.parseInt(aux[0]);
        
        System.out.println(numCasosPrueba+" "+numEquipos);
    }
    
    
    
}
