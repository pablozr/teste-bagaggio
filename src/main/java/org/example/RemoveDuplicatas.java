package org.example;

public class RemoveDuplicatas {
    public static int removerDuplicatas(int[] numeros) {
        if (numeros == null || numeros.length == 0) return 0;

        int tamanhoUnico = 1;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] != numeros[tamanhoUnico - 1]) {
                numeros[tamanhoUnico] = numeros[i];
                tamanhoUnico++;
            }
        }

        return tamanhoUnico;
    }
}
