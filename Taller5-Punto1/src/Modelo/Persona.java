
package Modelo;

import java.util.Scanner;

public class Persona {

    
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Cedula;
    
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
     
        
    public static String DatosPersona() {
        Scanner Persona = new Scanner(System.in);
        
        String Nombres;
        String Apellidos;
        int Edad;
        int Cedula;
        
        System.out.print("DIGITE SUS NOMBRES : ");
        Nombres = Persona.nextLine();
        System.out.print("DIGITE SUS APELLIDOS : ");
        Apellidos = Persona.nextLine();
        System.out.print("DIGITE SU EDAD : ");
        Edad = Persona.nextInt();
        System.out.print("DIGITE SU CEDULA : ");
        Cedula = Persona.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("NOMBRES : " + Nombres);
        System.out.println("APELLIDOS : " + Apellidos);
        System.out.println("EDAD : " + Edad);
        System.out.println("CEDULA : " + Cedula);
        
        return "";
        
    }

}

    
