package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class produtos {
    public static void run() {
        try {
            Scanner scan = new Scanner(System.in);

            String produtoUm;
            String produtoDois;
            String produtoTres;

            double precoUm;
            double precoDois;
            double precoTres;

            double menorValor;

            System.out.printf("------------------------------\n" +
                    "           PRODUTOS           \n" +
                    "------------------------------\n" +
                    "\n" +
                    "Primeiro produto: ");
            produtoUm = scan.nextLine();

            System.out.printf("Preço: ");
            precoUm = scan.nextDouble();

            System.out.printf("\n" +
                    "Segundo produto: ");
            scan.nextLine();
            produtoDois = scan.nextLine();

            System.out.printf("Preço: ");
            precoDois = scan.nextDouble();

            System.out.printf("\n" +
                    "Terceiro produto: ");
            scan.nextLine();
            produtoTres = scan.nextLine();

            System.out.printf("Preço: ");
            precoTres = scan.nextDouble();

            menorValor = Math.min(precoUm, precoDois);
            menorValor = Math.min(menorValor, precoTres);

            System.out.println();

            if (menorValor == precoUm) {
                System.out.printf("O produto" + produtoUm + " custando " + precoUm + " é o mais barato!");
            } else if (menorValor == precoDois) {
                System.out.printf("O produto" + produtoDois + " custando " + precoDois + " é o mais barato!");
            } else {
                System.out.printf("O produto" + produtoUm + " custando " + precoTres + " é o mais barato!");
            }
        }
        catch (Exception e) {
            if(e.toString().endsWith("InputMismatchException")) {
                System.out.println("\nErro! Insira um preço válido!");
            }
        }
    }
}
