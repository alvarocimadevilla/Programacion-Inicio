
package es.daw.astros;

import es.daw.astros.model.*;
import es.daw.astros.utils.Utils;



public class Astros {


    
    public static void main(String[] args) {
        
        int respuestaMenu;
        
        do {            
            Utils.mostrarMenu();
            respuestaMenu = Utils.lectorEntero.nextInt();
            
            switch (respuestaMenu) {
                case -1: break;
                case 1:                    
                    Utils.mostrarInfoPlaneta(Utils.tierra);
                    
                    break;                
                case 2:                    
                    Utils.mostrarInfoPlaneta(Utils.venus);
                    break;                
                case 3:                    
                    Utils.mostrarInfoPlaneta(Utils.marte);
                    break;                
                case 4:                    
                    Utils.mostrarInfoSatelites(Utils.luna);
                    break;                
                case 5:                    
                    Utils.mostrarInfoSatelites(Utils.fobos);                   
                    break;                
                case 6:                    
                    Utils.mostrarInfoSatelites(Utils.deimos);
                    break;
                default:
                    System.out.println("Escribe un numero animal");
            }
            if (respuestaMenu != -1){
                System.out.println("Pulsa ENTER para continuar");
                Utils.lectorCadena.nextLine();
            }
        } while (respuestaMenu != -1);
        
        
        
        
    }
    
}
