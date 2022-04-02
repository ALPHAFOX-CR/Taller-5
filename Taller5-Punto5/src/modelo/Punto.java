package modelo;

public class Punto {
    
    private int x;
    private int y;
    
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Punto (int y){
        this.y=y;
        this.x=0;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double calcularDistancia(int x, int y){
        int dx = x - this.x;
        int dy = y - this.y;
        
        double dx2 = Math.pow(dx, 2);
        double dy2 = Math.pow(dy, 2);
        
        double distancia = Math.sqrt(dx2 + dy2);
        return distancia;
    
    }
    public double calcularDistancia(Punto p){
        return this.calcularDistancia(p.getX(), p.getY());
    }
    public double calcularDistancia(int y){
        Punto p = new Punto(y);
        return this.calcularDistancia(p);
    }
}
