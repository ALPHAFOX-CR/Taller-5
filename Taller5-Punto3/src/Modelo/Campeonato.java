
package Modelo;

import java.util.Scanner;

public class Campeonato {

    
    private int NumEquipos;
    private String NomEquipo;
    private String CiudadEquipo;
    private String NomTecnico;
    private int NumInscripcion;
    private int NumJugadores;
    private String NomJugador;
    private int Edad;
    private String Posicion;
    
    public Campeonato(){
        this.NumEquipos = 5;
        this.NumJugadores = 6;
    }
    
    public int getNumEquipos() {
        return NumEquipos;
    }
    public void setNumEquipos(int NumEquipos) {
        this.NumEquipos = NumEquipos;
    }
    public String getNomEquipo() {
        return NomEquipo;
    }
    public void setNomEquipo(String NomEquipo) {
        this.NomEquipo = NomEquipo;
    }
    public String getCiudadEquipo() {
        return CiudadEquipo;
    }
    public void setCiudadEquipo(String CiudadEquipo) {
        this.CiudadEquipo = CiudadEquipo;
    }
    public String getNomTecnico() {
        return NomTecnico;
    }
    public void setNomTecnico(String NomTecnico) {
        this.NomTecnico = NomTecnico;
    }
    public int getNumInscripcion() {
        return NumInscripcion;
    }
    public void setNumInscripcion(int NumInscripcion) {
        this.NumInscripcion = NumInscripcion;
    }
    public int getNumJugadores() {
        return NumJugadores;
    }
    public void setNumJugadores(int NumJugadores) {
        this.NumJugadores = NumJugadores;
    }
    public String getNomJugador() {
        return NomJugador;
    }
    public void setNomJugador(String NomJugador) {
        this.NomJugador = NomJugador;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public String getPosicion() {
        return Posicion;
    }
    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    public static String DatosCampeonato(){
        
        Scanner n = new Scanner(System.in);
        int NumEquipos = 5;
        String[] NomEquipo = new String[NumEquipos];
        String[] CiudadEquipo = new String[NumEquipos];
        String[] NomTecnico = new String[NumEquipos];
        int[] NumInscripcion = new int[NumEquipos];
        int NumJugadores = 6;
        String[] NomJugador = new String[NumJugadores];
        int[] Edad = new int[NumJugadores];
        String[] Posicion = new String[NumJugadores];
        
        System.out.println("NUMERO DE EQUIPOS DEL CAMPEONATO : " + NumEquipos);
        System.out.println("");
        
        for(int i = 0; i < NumEquipos ; i++ ){
            System.out.print("DIGITE EL NOMBRE DEL EQUIPO " + (i+1) + " : ");
            NomEquipo[i] = n.next();
            System.out.println("");
            System.out.print("DIGITE LA CIUDAD DEL EQUIPO " + (i+1) + " : ");
            CiudadEquipo[i] = n.next();
            System.out.println("");
            System.out.print("DIGITE EL NOMBRE DEL TECNICO DEL EQUIPO " + (i+1) + " : ");
            NomTecnico[i] = n.next();
            System.out.println("");
            System.out.print("DIGITE EL NUMERO DE INSCRIPCION DEL EQUIPO " + (i+1) + " : ");
            NumInscripcion[i] = n.nextInt();
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            System.out.println(".......... JUGADORES DEL EQUIPO "+ (i+1) +" ..........");
            System.out.println("");
            
            for(int j = 0; j < NumJugadores; j++){
            
            System.out.print("DIGITE EL NOMBRE DEL JUGADOR " + (j+1) + " : ");
            NomJugador[j] = n.next();
            System.out.println("");
            System.out.print("DIGITE LA EDAD DEL JUGADOR " + (j+1) + " : ");
            Edad[j] = n.nextInt();
            System.out.println("");
            System.out.print("DIGITE LA POSICION DEL JUGADOR " + (j+1) + " : ");
            Posicion[j] = n.next();
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            }
        }
            System.out.println(".......... EQUIPOS ..........");
            
        for(int i = 0; i < NumEquipos ; i++ ){
            
            System.out.print("NOMBRE DEL EQUIPO " + (i+1) + " : " +  NomEquipo[i]);
            System.out.println("");
            System.out.print("CIUDAD DEL EQUIPO " + (i+1) + " : " + CiudadEquipo[i]);
            System.out.println("");
            System.out.print("NOMBRE DEL TECNICO DEL EQUIPO " + (i+1) + " : " + NomTecnico[i]);
            System.out.println("");
            System.out.print("NUMERO DE INSCRIPCION DEL EQUIPO " + (i+1) + " : " + NumInscripcion[i]);
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            
           
            System.out.println(".......... JUGADORES ..........");
        for(int j = 0; j < NumJugadores; j++){
            
            System.out.print("NOMBRE DEL JUGADOR " + (j+1) + " : " + NomJugador[j]);
            System.out.println("");
            System.out.print("DIGITE LA EDAD DEL JUGADOR " + (j+1) + " : " + Edad[j]);
            System.out.println("");
            System.out.print("DIGITE LA POSICION DEL JUGADOR " + (j+1) + " : " + Posicion[j]);
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            
            }
        
        }
    
    return "";
    }
}
