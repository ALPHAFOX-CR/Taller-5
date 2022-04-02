
package Vista;

import Modelo.Parrafo;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        Parrafo p = new Parrafo("MARIA SANTA MARIA, CARACTERIS VIRGEN, MARIA ERA BUENA MARIA");
        System.out.println("NUMERO DE VOCALES : " + p.nVocales());
        System.out.println("NUMERO DE CONSONANTES : " + p.nConsonantes());
        System.out.println("NUMERO DE SIMBOLOS : " + p.nSimbolos());
        System.out.println("PALABRAS REPETIDAS : " + p.Buscar("MARIA") +" "+ "VECES");
        
        System.out.println("NUMERO DE PALABRAS : " + p.nPalabras());
        System.out.println("LA PALABRA MAS LARGA ES : " + p.PalabraMayor());
        System.out.println(p.getTexto());
    }
}
