package org.example;

public class Questao5 {
    public static void main(String[] args) {

        int[] precos1 = {7, 1, 5, 3, 6, 4};

        int precoMinimo1 = Integer.MAX_VALUE;
        int lucroMaximo1 = 0;

        for (int preco : precos1) {
        if (preco < precoMinimo1) {
            precoMinimo1 = preco;
        }
        else if (preco - precoMinimo1 > lucroMaximo1) {
            lucroMaximo1 = preco - precoMinimo1;
        }
    }
        System.out.println("Para o array [7, 1, 5, 3, 6, 4]:");
        System.out.println("Maior Lucro: " + lucroMaximo1);
        System.out.println("----------------------------------");

        int[] precos2 = {7, 6, 4, 3, 1};

        int precoMinimo2 = Integer.MAX_VALUE;
        int lucroMaximo2 = 0;

        for (int preco : precos2) {
        if (preco < precoMinimo2) {
            precoMinimo2 = preco;
        } else if (preco - precoMinimo2 > lucroMaximo2) {
            lucroMaximo2 = preco - precoMinimo2;
        }
    }

        System.out.println("Para o array [7, 6, 4, 3, 1]:");
        System.out.println("Maior Lucro: " + lucroMaximo2);
}
}
