import java.util.Random;

public class Reto2 {
    public static void main(String[] args) throws Exception {
        //Random r = new Random(123);
        //Random r2 = new Random(123);

        System.out.println("ALEATORIOS:");
        for (int i = 0; i < 5; i++) {
            Random r = new Random(123);
            System.out.println("R:"+r.nextInt(5));    
            //System.out.println("R1:"+r.nextInt(5));    
            //System.out.println("R2:"+r2.nextInt(5)); 
            System.out.println();   
        }
        
        
    }
}
