
package Modelo;

import java.util.Scanner;


public class FechaNacimiento {
        private String Dia;
        private String Mes;
        private String Año;
        
    public String getDia() {
        return Dia;
    }
    public void setDia(String Dia) {
        this.Dia = Dia;
    }
    public String getMes() {
        return Mes;
    }
    public void setMes(String Mes) {
        this.Mes = Mes;
    }
    public String getAño() {
        return Año;
    }
    public void setAño(String Año) {
        this.Año = Año;
    }
        
        public static String DatosFecha() {
            
            Scanner fecha =  new Scanner(System.in);
            String Dia;
            String Mes;
            String Año;
            
            System.out.print("DIGITE EL DIA DE NACIMIENTO : ");
            Dia =fecha.next();
            System.out.print("DIGITE EL MES DE NACIMIENTO : ");
            Mes = fecha.next();
            System.out.print("DIGITE EL AÑO DE NACIMIENTO : ");
            Año = fecha.next(); 
            System.out.println("----------------------------");
            System.out.println("LA FECHA DE NACIMIENTO ES : " + Dia + " / " + Mes + " / " + Año );
            
            return "";
        }
}
