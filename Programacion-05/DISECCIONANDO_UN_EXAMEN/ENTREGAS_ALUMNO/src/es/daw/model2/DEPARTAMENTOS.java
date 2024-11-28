package es.daw.model2;

/**
 *
 * @author melol
 */
public enum DEPARTAMENTOS {
     DESARROLLO ("DES"),
     CONTABILIDAD ("CNT"),
     RRHH ("RH"),
     CONSULTORIA ("CST");

     private String codigo;

     private DEPARTAMENTOS(String codigo) {
          this.codigo = codigo;
     }

     public String getCodigo() {
          return codigo;
     }

     
}

