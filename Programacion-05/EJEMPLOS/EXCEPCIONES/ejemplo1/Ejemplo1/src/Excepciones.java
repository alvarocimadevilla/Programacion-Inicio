public class Excepciones {

    /**
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String[] args){
        //¿QUÉ SE VA A PINTAR POR CONSOLA?????
        /*
          Las trazas de un error
          Un 1
          Un 2
          Un 3
          Nada
         */
        try {
            System.out.println(devuelveNumero(4));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Captura la pedazo excepción!!!!");
            e.printStackTrace();
        }

        System.out.println("*******> CHIMPÚN!!!!!");
    }


    /*
     * Lanza una excepción cuando el número es par
     */
    public static int devuelveNumero(int num) throws Exception {
        int resultado = 0;
        //try {
            if (num % 2 == 0) {
                System.out.println("Es par y lanzo excepcion");
                // 1. Me creo el objeto excepción
                Exception e = new Exception("Lanzando exception. Es número par!!!!");
                // 2. Lanzo el objeto excepción
                //throw new Exception("Lanzando exception");
                throw e;
            }
            resultado = 1;
        /* } catch (Exception ex) {
            // 3. Recojo la excepción
            System.out.println("Recojo excepción " + ex.getMessage());
            resultado = 2;
        }
        finally {
            // 4. Siempre pasa. Es para limpiar código, cerrar flujos etc...
            System.out.println("Siempre pasa");
            resultado = 3;
        }*/

        System.out.println("Fin!!!");
        return resultado;
    }
}