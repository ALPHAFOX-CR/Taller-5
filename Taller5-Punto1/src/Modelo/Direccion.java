
package Modelo;

import java.util.Scanner;

public class Direccion {

    private String DireccionDomicilio;
    private String DireccionTrabajo;
    
    public String getDireccionDomicilio() {
        return DireccionDomicilio;
    }
    public void setDireccionDomicilio(String DireccionDomicilio) {
        this.DireccionDomicilio = DireccionDomicilio;
    }
    public String getDireccionTrabajo() {
        return DireccionTrabajo;
    }
    public void setDireccionTrabajo(String DireccionTrabajo) {
        this.DireccionTrabajo = DireccionTrabajo;
    }
    
    public static String DatosDireccion(){
        Scanner Direccion = new Scanner(System.in);
        String DireccionDomicilio;
        String DireccionTrabajo;
        
        System.out.print("DIGITE LA DIRECCION DE DOMICILIO : ");
        DireccionDomicilio = Direccion.nextLine();
        System.out.print("DIGITE LA DIRECION DEL TRABAJO : ");
        DireccionTrabajo = Direccion.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println("DIRECCION DOMICILIO : " + DireccionDomicilio );
        System.out.println("DIRECCION TRABAJO : " + DireccionTrabajo );
        
        return "";
    }
}
