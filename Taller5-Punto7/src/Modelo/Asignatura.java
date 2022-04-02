
package Modelo;


public class Asignatura
{
    private String nombre;
    private int codigo;
    public static final int N_MAX_GRUPOS=3;
    private Grupo gruposInscritos[];
    private int n;
    
    public Asignatura()
    {
        this.gruposInscritos = new Grupo[this.N_MAX_GRUPOS];
        this.n=0;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public Grupo[] getGruposInscritos() 
    {
        return gruposInscritos;
    }

    public void setGruposInscritos(Grupo[] gruposInscritos) 
    {
        this.gruposInscritos = gruposInscritos;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }
    
    public int getN_MAX_GRUPOS() 
    {
        return N_MAX_GRUPOS;
    }
    
    public boolean inscribirGrupo(int numGrupo, String docente)
    {
        if(this.n<this.N_MAX_GRUPOS){
             Grupo g = new Grupo(numGrupo, docente);
             this.gruposInscritos[this.n]=g;
             this.n++;
             return true;
        }
        else{
            return false;
        }
    }
}
