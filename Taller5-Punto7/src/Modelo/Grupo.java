
package Modelo;

public class Grupo
{
    private int n_Grupo;
    private String docenteAcargo;
    public static final int N_MAX_ESTUDIANTES=3;
    private Estudiante listaEstudiantes[];
    private int n;
    
    public Grupo()
    {
        this.listaEstudiantes = new Estudiante[Grupo.N_MAX_ESTUDIANTES];
        this.n=0;
    }
    
    public Grupo(int g, String d)
    {
        this();
        this.n_Grupo=g;
        this.docenteAcargo=d;
    }

    public int getN_Grupo()
    {
        return n_Grupo;
    }

    public void setN_Grupo(int n_Grupo)
    {
        this.n_Grupo = n_Grupo;
    }

    public String getDocenteAcargo()
    {
        return docenteAcargo;
    }

    public void setDocenteAcargo(String docenteAcargo)
    {
        this.docenteAcargo = docenteAcargo;
    }

    public Estudiante[] getListaEstudiantes()
    {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes)
    {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getN()
    {
        return n;
    }

    public void setN(int n)
    {
        this.n = n;
    }
    
    public int getN_MAX_ESTUDIANTES() {
        return N_MAX_ESTUDIANTES;
    }
    
    public boolean inscribirEstudiantes(Estudiante e){
        if(this.n<this.N_MAX_ESTUDIANTES){
            this.listaEstudiantes[this.n]=e;
            this.n++;
            return true;
        }
        return false;
    }
}
