
package Vista;
import Modelo.*;
import java.util.Scanner;

public class ClasePrincipal {

    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Persona r = new Persona();
        Direccion t = new Direccion();
        FechaNacimiento f = new FechaNacimiento();
        
        int Op;
        
        System.out.print("DIGITE LAS PERSONAS QUE DESEA REGISTRAR : ");
        Op = p.nextInt();
        System.out.println("                                         ");
        
        for (int i = 0; i < Op; i++){
            System.out.println(" ........ DATOS DE PERSONALES ........ ");
            System.out.println(Persona.DatosPersona());
            System.out.println(FechaNacimiento.DatosFecha());
            System.out.println(Direccion.DatosDireccion());
            System.out.println("-------------------------------------------");
    }
}
}
