
package Modelo;

public class Parrafo
{
    private String texto;
    
    public Parrafo()
    {
        }
    
    public Parrafo(String p)
    {
        this.texto = p;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }
    
    public String nVocales()
    {
       int contador = 0;
        for (int i = 0; i < this.texto.length(); i++)
        {
            if ((this.texto.charAt(i)=='A') || (this.texto.charAt(i)=='E') || (this.texto.charAt(i)=='I') 
                            || (this.texto.charAt(i)=='O') || (this.texto.charAt(i)=='U'))
            contador++;
        }
       return String.valueOf(contador);
    }
    
    public static boolean Consonante(char letra)
    {
	return "BCDFGHJKLMNÑPQRSTVWXYZ".contains(String.valueOf(letra).toLowerCase());
    }
    
    public String nConsonantes()
    {
        int contador = 0;
	for (int x = 0; x < this.texto.length(); x++)
        {
	char letra = this.texto.charAt(x);
            if (Consonante(letra))
            {
                contador++;
            }
	}
        return String.valueOf(contador);
    }
    
    public static boolean Simbolos(char letra)
    {
        //SIMBOLOS MAS CONOCIDOS
	return "!#$%&/)(=?¡¿.;,:".contains(String.valueOf(letra).toLowerCase());
    }
    
    public String nSimbolos()
    {
        int contador = 0;
	for (int x = 0; x < this.texto.length(); x++)
        {
	char letra = this.texto.charAt(x);
            if (Simbolos(letra))
            {
                contador++;
            }
	}
        return String.valueOf(contador);
    }
    
    public String Buscar(String palabra)
    {
        int posicion = 0;
        int contador = 0;
        posicion = this.texto.indexOf(palabra);
        while(posicion != -1)
        {
            contador++;
            posicion = this.texto.indexOf(palabra, posicion+1);
        }
        return String.valueOf(contador);
    }
    
    public String nPalabras()
    {
        int contador = 1, posicion;
        this.texto = this.texto.trim();                             
        if (this.texto.isEmpty())
        {
            contador = 0;
        } else {
            posicion = this.texto.indexOf(" ");
            while (posicion != -1) {   
                   contador++;
                   posicion = this.texto.indexOf(" ", posicion + 1);                     
            }
    }
        return String.valueOf(contador);
    }
    
    public String PalabraMayor()
    {
        int longitud = 0;
        int posicion = 0;
        int mayor = 0;
        int posMayor = 0;
        for (int i = 0; i < this.texto.length(); i++)
        {
            while (! Character.isLetter(this.texto.charAt(i)) && (i+1)<this.texto.length())
            {
                i++;
            }
            posicion = 1;
            longitud = 0;
            while (Character.isLetter(this.texto.charAt(i)) && (i+1)<this.texto.length())
            {
                longitud++;
                i++;
            }
            if (longitud > mayor)
            {
                mayor = longitud;
                posMayor = posicion;
            }
        }
        String palabra = "";
        for (int i = 0; i < mayor; i++)
        {
            palabra = palabra.concat(String.valueOf(this.texto.charAt(posMayor+1)));   
        }
        return palabra;
        
    }
}
