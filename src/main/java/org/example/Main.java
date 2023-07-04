package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolhido;

        System.out.println("Escolha uma das seguintes atividades:\n");
        System.out.println("1- Fome e dinheiro");
        System.out.println("2- Produtos");
        System.out.println("3- Quiz\n");
        System.out.printf("Atividade escolhida: ");
        escolhido = scan.nextInt();

        System.out.println();

        switch (escolhido) {
            case 1:
                cantina.run();
                break;
            case 2:
                produtos.run();
                break;
            case 3:
                perguntas.run();
                break;
            default:
                System.out.println("Nenhuma das opções foi escolhida.");
                break;
        }
    }
}