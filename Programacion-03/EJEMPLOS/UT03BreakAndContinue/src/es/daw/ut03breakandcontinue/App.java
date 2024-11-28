package es.daw.ut03breakandcontinue;

/**
 *
 * @author melola
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejemplo básico de break en while");
        
        int i = 0;
        while(true){
            System.out.println("Bucle infinito!!!!");
            break;
        }
        
        while (i < 5){
            System.out.println("El valor de i es: "+i);
            i++;
            //break;
        }
        
        System.out.println("Ejemplo básico de break con for");
        for (int j = 0; j < 5; j++) {
            if (j < 3)
                System.out.println("El valor de j es: "+j);
            else{
                System.out.println("Me salgo del for!!!!!!!!");
                break;
            }
            
        }
        
        System.out.println("Ejemplo básico de continue con for");
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println("El valor de j es: "+j);
        }

        
    }
    
}
