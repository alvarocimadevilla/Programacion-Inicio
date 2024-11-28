package es.daw.poo2.model;

import java.time.LocalDate;

public class Client implements Comparable<Client>{

    //1. ATRIBUTOS
    private String code;
    private String name;
    private String phoneNumber;
    private LocalDate registrationDate;


    // 2. CONSTRUCTORES
    public Client(String code, String name, String phoneNumber, LocalDate registrationDate) {
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
    }


    public Client(String code, String name, LocalDate registrationDate) {
        // sobrecarga de constructores. Llamadas entre constructores con this()...
        this(code,name,"WITHOUT_PHONE",registrationDate);
        // this.code = code;
        // this.name = name;
        // this.registrationDate = registrationDate;
        // phoneNumber = "WITHOUT_PHONE";
    }

    public Client(String code) {
        this.code = code;
    }


    // GETTERS
    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public LocalDate getRegistrationDate() {
        return registrationDate;
    }    
    
    

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // INTERFACE COMPARABLE
    @Override
    public int compareTo(Client o) {
        return registrationDate.compareTo(o.registrationDate);
    }

    // SOBREESCRITURA DE MÉTODOS DE OBJECT
    @Override
    public String toString() {
        return "Client [code=" + code + ", name=" + name + ", phoneNumber=" + phoneNumber + ", registrationDate="
                + registrationDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }


    



    
}
