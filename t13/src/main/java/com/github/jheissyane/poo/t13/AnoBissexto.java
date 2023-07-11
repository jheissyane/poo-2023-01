package com.github.jheissyane.poo.t13;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 2024;

        boolean bissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || ano % 400 == 0) {
                bissexto = true;
            }
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
