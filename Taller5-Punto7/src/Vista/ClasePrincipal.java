
package Vista;

import Modelo.*;
public class ClasePrincipal 
{
    public static void main(String[] args)
    {
        System.out.println("CREACION DE OBJETOS DE GRUPO: ");
        Grupo grupo01 = new Grupo(10, "CARLOS");
        Grupo grupo02 = new Grupo(02, "PEPE");
        Grupo grupo03 = new Grupo(12, "JHON");
        Grupo grupo04 = new Grupo(04, "MARIA");
        
        
        Asignatura asig = new Asignatura();
        
        System.out.println("\n\nINSCRIPCION DE EQUIPOS AL CAMPEONATO: ");
 
        
    }
    
    public static void inscribirEstudiante(Grupo g, Estudiante e){
        if(g.inscribirEstudiantes(e)){
            System.out.printf("%s INSCRITO EXCITOSAMENTE, QUEDAN %d CUPOS\n"
                             ,e.getPrimerNombre(), g.getN_MAX_ESTUDIANTES()- g.getN());
        }
        else{
            System.out.printf("NO ES POSIBLE INSCRIBIRSE A %s, LIMITE DE EQUIPOS CUMPLIDOS\n"
                              , e.getPrimerNombre());
        }
    }
}

