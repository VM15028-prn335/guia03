
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author linux
 */
@LocalBean
@Dependent
public class Utilities implements Serializable{
    //regresa las primeras 30 letras de un texto ingresado
       public String getResume(String texto){
        String cadena="";
        for(int i=0;i<20 ;i++){
            cadena=cadena+texto.charAt(i);
        }
        texto=cadena;
        return texto;   
    }
    //metodo q capitaliza el texto con iniciales mayuculas ni dobles espacios
    public String capitalizar(String texto) {
        String cadena = "";
       
        for (int rec2 = 0; rec2 < texto.length(); rec2++) {
            texto = texto.replaceAll("  ", " ");
        }
        if (texto.charAt(0) != ' ') {
            cadena = String.valueOf(texto.charAt(0)).toUpperCase();
        }

        for (int rec = 1; rec < texto.length(); rec++) {
            if (texto.charAt(rec - 1) == ' ' && texto.charAt(rec) != ' ') {
                cadena += String.valueOf(texto.charAt(rec)).toUpperCase();
            } else {
                cadena += texto.charAt(rec);
            }

        }
        return cadena;
    }
// devuleve las palabras repetidas de un texto ingresado
  public int contarCoincidencias(String frase, String texto) {
        int cantidad=0, niv = 0;
        String busqueda;
        if (frase.length() < texto.length()) {
            for (int rec = frase.length(); rec <= texto.length(); rec++, niv++) {
                busqueda = "";
                for (int rec2 = 0 + niv; rec2 < frase.length() + niv; rec2++) {
                    busqueda += String.valueOf(texto.charAt(rec2));
                }
                if (frase.equalsIgnoreCase(busqueda)) {
                    cantidad++;
                }
            }

        } else {
            cantidad=0;
        }
        return cantidad;
    }
}
