/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudandoadomjudge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioD { 
    
    
    
  
    public static void leerCasosPrueba(){
        ArrayList<String> vResultado = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String caso = leer.nextLine();
        
        String guardar="";
        int numEquipos, numCasosPrueba;
        
        String aux[] = caso.split(" ");
        
        numEquipos = Integer.parseInt(aux[1]);
        numCasosPrueba = Integer.parseInt(aux[0]);
        
        //System.out.println(numCasosPrueba+" "+numEquipos);
        
        Scanner leer2 = new Scanner(System.in); 
              String datos=""; 
        for (int i = 0; i < numEquipos; i++) {
            String equipos = leer2.nextLine();
            String nombredelequipo="";
            int suma = 0;
            int contador=0;
            
            
            String e[] = equipos.split(" "); 
            
            nombredelequipo = e[0];
           
            
             for (int j = 1; j < e.length; j++) {                 
                 if (!e[j].equalsIgnoreCase("-")) {
                      int puntos=0;
                      String numerosumar=e[j];
                    puntos=Integer.parseInt(numerosumar);
                     suma+=puntos;
                     contador++;                          
                 } else{
                     j++;
                 }
                
             
              
             
            }
       datos+=nombredelequipo+" "+contador+" "+suma+"\n";  
        guardar=nombredelequipo+" "+contador+" "+suma;
       
       vResultado.add(guardar);
      
        }
        System.out.println("/*/*/*/-/*/*/*/");
           
          System.out.println(datos);    
    }
    
    
    
}
