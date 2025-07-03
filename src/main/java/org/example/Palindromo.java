package org.example;

public class Palindromo {
    
    public static boolean verificarPalindromo(String texto) {
        if (texto == null) return false;
        
        String limpo = texto.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        if (limpo.isEmpty()) return false;
        
        return limpo.equals(new StringBuilder(limpo).reverse().toString());
    }
    
    public static String criarPalindromo(String texto) {
        if (texto == null) return "";
        return texto + " | " + new StringBuilder(texto).reverse().toString();
    }
} 