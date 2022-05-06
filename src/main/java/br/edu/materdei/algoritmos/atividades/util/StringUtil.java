package br.edu.materdei.algoritmos.atividades.util;

public class StringUtil {

    public static String inverter(String text) {
        StringBuilder builder = new StringBuilder(text);
        String textoInvertido = builder.reverse().toString();
        
        return textoInvertido;
    }  
    
}
