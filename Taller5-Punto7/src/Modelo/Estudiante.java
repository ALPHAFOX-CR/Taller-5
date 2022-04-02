
package Modelo;

public class Estudiante
{
    private String primerNombre;
    private String primerApellido;
    private double notap1;
    private double notap2;
    private double notap3;
    
    public Estudiante()
    {
        
    }
    
    public Estudiante(String n, String a, double n1, double n2, double n3)
    {
        this.primerNombre=n;
        this.primerApellido=a;
        this.notap1=n1;
        this.notap2=n2;
        this.notap3=n3;
    }

    public String getPrimerNombre()
    {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre)
    {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido()
    {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido)
    {
        this.primerApellido = primerApellido;
    }

    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1)
    {
        this.notap1 = notap1;
    }

    public double getNotap2()
    {
        return notap2;
    }

    public void setNotap2(double notap2)
    {
        this.notap2 = notap2;
    }

    public double getNotap3()
    {
        return notap3;
    }

    public void setNotap3(double notap3)
    {
        this.notap3 = notap3;
    }
}
