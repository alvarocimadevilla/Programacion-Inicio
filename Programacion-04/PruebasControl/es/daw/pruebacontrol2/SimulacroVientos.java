/*
 * https://github.com/profeMelola/Programacion-04-2023-24/blob/main/PruebasControl/readme.md#sensor-de-viento
 */
package es.daw.pruebacontrol2;

/**
 *
 * @author melol
 */
public class SimulacroVientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dirViento = "NE#SO#NE#O#NE#SE#E#N#O#O#N#O#SE#NO#SO#SE#S#S#O#NO#SE#N#NO#NO#NE#SE#S#NO#O#SE#NO#SE#NE#E#NE#NE#SE#NO#SO#E#NE#S#NO#NE#SO#N#NE#SE#SO#NE#S#SE#NO#N#NE#NO#NO#SO#SE#N#NO#NE#N#E#O#E#O#N#NO#N#S#SO#SE#O#NE#N#NO#S#E#SE#NO#SE#E#S#NO#N#SE#SE#SO#NE#N#N#S#SE#S#O#N#SO#O#SE";
        String fueViento = "11@45@64@42@19@23@44@71@79@86@43@23@79@97@58@7@12@42@7@70@14@49@10@46@97@60@50@92@60@78@8@64@54@85@14@4@77@7@22@6@58@61@5@3@23@27@41@36@55@91@4@21@49@41@36@55@11@52@38@69@83@20@66@100@88@57@54@30@61@15@78@49@63@89@47@7@2@40@82@78@6@54@100@85@34@16@97@99@69@11@93@65@26@95@78@75@42@55@30@92";

        
        // Podríamos comprobar previamente que el número total de muestra coincide...
        
        int nElem = obtenerNumeroTotalMuestras(fueViento);
        
        // Obteniendo valor máximo y mínimo
        int maxIndex = 0, minIndex = 0;
        int auxMax = 0, auxMin = 100, auxFuerza;
        
        for (int i = 1; i <= nElem; i++) {
            auxFuerza = obtenerFuerzaViento(fueViento, i);
            if (auxFuerza < auxMin) {
                auxMin = auxFuerza;
                minIndex = i;
            }
            if (auxFuerza > auxMax) {
                auxMax = auxFuerza;
                maxIndex = i;
            }
        }
        
        System.out.print("El valor mínimo del viento fue: ");
        System.out.println(obtenerDireccionViento(dirViento, minIndex) + " - " + auxMin);
        System.out.print("El valor máximo del viento fue: ");
        System.out.println(obtenerDireccionViento(dirViento, maxIndex) + " - " + auxMax);

        // Valor medio de cada dirección
        float acumSur = 0, nMuestrasSur = 0;
        float acumNorte = 0, nMuestrasNorte = 0;
        float acumEste = 0, nMuestrasEste = 0;
        float acumOeste = 0, nMuestrasOeste = 0;
                
        for (int i = 1; i <= nElem; i++) {
            String dir = obtenerDireccionViento(dirViento, i);
            int fue = obtenerFuerzaViento(fueViento, i);
            
            switch (dir) {
                case "S":
                    acumSur += fue * 2;
                    nMuestrasSur += 2;
                    break;
                case "N":
                    acumNorte += fue * 2;
                    nMuestrasNorte += 2;
                    break;
                case "O":
                    acumOeste += fue * 2;
                    nMuestrasOeste += 2;
                    break;
                case "E":
                    acumEste += fue * 2;
                    nMuestrasEste += 2;
                    break;
                case "SO":
                    acumSur += fue;
                    nMuestrasSur++;
                    acumOeste += fue;
                    nMuestrasOeste++;
                    break;
                case "SE":
                    acumSur += fue;
                    nMuestrasSur++;
                    acumEste += fue;
                    nMuestrasEste++;
                    break;
                case "NO":
                    acumNorte += fue;
                    nMuestrasNorte++;
                    acumOeste += fue;
                    nMuestrasOeste++;
                    break;
                case "NE":
                    acumNorte += fue;
                    nMuestrasNorte++;
                    acumEste += fue;
                    nMuestrasEste++;
                    break;

            }
            
            
        }  //end for          

        System.out.println("Sur   - fuerza media: " + ((float) acumSur / nMuestrasSur));
        System.out.println("Norte - fuerza media: " + ((float) acumNorte / nMuestrasNorte));
        System.out.println("Este  - fuerza media: " + ((float) acumEste / nMuestrasEste));
        System.out.println("Oeste - fuerza media: " + ((float) acumOeste / nMuestrasOeste));


    }

    /**
     * Función para obtener la fuerza del viento a partir de su número de muestra
     * @param fuerza
     * @param indice
     * @return 
     */
    public static int obtenerFuerzaViento(String fuerza, int indice) {
        String auxValFuerza = "";
        int cuentaIndice = 1;
        
        for (int i = 0; i < fuerza.length(); i++) {
            if (fuerza.charAt(i) == '@') {
                cuentaIndice++;
            } else if (indice == cuentaIndice) {
                auxValFuerza += fuerza.charAt(i);
            }
        }
        //return Integer.valueOf(auxValFuerza);
        return Integer.parseInt(auxValFuerza);
        
    }

    /**
     * Función para obtener la dirección del viento a partir de su número de muestra
     * @param direccion
     * @param indice
     * @return 
     */
    public static String obtenerDireccionViento(String direccion, int indice) {
        String dirViento = "";
        int cuentaIndice = 1;
        for (int i = 0; i < direccion.length(); i++) {
            if (direccion.charAt(i) == '#') {
                cuentaIndice++;
            } else if (indice == cuentaIndice) {
                dirViento += direccion.charAt(i);
            }
        }
        return dirViento;
    }

    /**
     * Función para obtener le número total de muestras
     * @param muestras Puede recibir como muestra la dirección del viento o la fuerza 
     * @return 
     */
    public static int obtenerNumeroTotalMuestras(String muestras) {
        int nMuestras = 1;
        for (int i = 0; i < muestras.length(); i++) {
            if (muestras.charAt(i) == '@' || muestras.charAt(i) == '#') {
                nMuestras++;
            }
        }
        return nMuestras;
    }

}
