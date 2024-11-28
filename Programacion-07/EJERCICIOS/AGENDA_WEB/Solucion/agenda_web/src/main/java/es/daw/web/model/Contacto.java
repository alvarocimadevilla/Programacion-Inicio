package es.daw.web.model;

import java.time.LocalDate;

public class Contacto {
    
        private String nombre;
        private String apellidos;
        private LocalDate fechaAlta;
        
        public Contacto() { 
            super();
        }
    
        public Contacto(String nombre, String apellidos, LocalDate fechaAlta) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaAlta = fechaAlta;
        }

        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellidos() {
            return apellidos;
        }
    
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
    
        public LocalDate getFechaAlta() {
            return fechaAlta;
        }
    
        public void setFechaAlta(LocalDate fechaNacimiento) {
            this.fechaAlta = fechaNacimiento;
        }

        @Override
        public String toString() {
            return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaAlta=" + fechaAlta + "]";
        }
    
        
    }
    