package es.daw.web.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import es.daw.web.model.Contacto;

public class UtilAgenda {
    
    /**
     * loadCSV
     * @param pathCSV
     * @param agenda
     * @throws IOException
     */
	public static void loadCSV(Path pathCSV, Map<String,Contacto> agenda) throws IOException {
		
		// Con Files.readAllLines
        List<String> lineas = Files.readAllLines(pathCSV);
        String[] datos = new String[5];
        for(int i = 1; i< lineas.size();i++) {
        	datos = lineas.get(i).split(";");
        	System.out.println(Arrays.toString(datos));
        	agenda.put(datos[0],new Contacto(datos[1],datos[2],LocalDate.parse(datos[3])));
        }
	}

    /**
     * pintaAgenda
     * @param agenda
     */
	public static void pintaAgenda(Map<String,Contacto> agenda) {
	    //La forma más normal de recorrer un Map es tomar su conjunto de claves, iterar por ellas, y
	    //para cada una de ellas, obtener el valor.
	    for (String key : agenda.keySet()) {
	        System.out.println("* Clave:"+key);
	        System.out.println("* Valor:"+agenda.get(key));
	    }
	    
	    //También podemos iterar por sus Entry
	    /*for (Map.Entry<String, Persona> entry : agenda.entrySet()) {
	        String key = entry.getKey();
	        Persona value = entry.getValue();
	        System.out.println("clave: " + key + ", valor: " + value);
	    }*/
	    
	}

    /**
     * agenda2String
     * @param agenda
     * @return
     */
	public static String agenda2HTML(Map<String,Contacto> agenda) {
        StringBuilder sb = new StringBuilder();
	    for (String key : agenda.keySet()) {
	        sb.append(String.format("<p>%s - %s</p>", key, agenda.get(key)));
	    }
	    
        System.out.println("[agenda2HTML] "+sb.toString());
        return sb.toString();

	    
	}

    /**
     * buscaPersonaPorTelefono
     * @param agenda
     * @param telefono
     * @return
     * @throws Exception
     */
    public static Contacto buscaPersonaPorTelefono(Map<String,Contacto> agenda,String telefono) throws Exception {
        if (agenda.containsKey(telefono)) 
        	return agenda.get(telefono);
        else {
            throw new Exception("No existe en la agenda una persona con el teléfono "+telefono); //propaga una excepción que debes chequear con try catch y volvera a propagar
        }
    }

    /**
     * obtenerAgendaOrdenadaNatural
     * @param agenda
     * @return
     */
    public static TreeMap<String,Contacto> obtenerAgendaOrdenadaNatural(Map<String,Contacto> agenda){
    	return new TreeMap<String,Contacto>(agenda);
    }

}
