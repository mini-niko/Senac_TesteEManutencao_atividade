package org.example;

import java.util.Scanner;

public class perguntas {
    public static void run() {
        Scanner scan = new Scanner(System.in);

        String respUm;
        String respDois;
        String respTres;
        int somatoria = 0;

        System.out.println("----------------------");
        System.out.println("  Perguntas do Senac  ");
        System.out.println("----------------------");
        System.out.printf("\n" +
                "(1) Quem sou eu?\n\n" +
                "a) Maurício\n" +
                "b) Um programador\n" +
                "c) Um rico bilionário\n" +
                "d) Lucas\n\n" +
                "Resposta: ");
        respUm = scan.nextLine();

        System.out.printf("\n" +
                "(2) Quem está do meu lado?\n\n" +
                "a) Ninguém\n" +
                "b) Uma programadora\n" +
                "c) Maria\n" +
                "d) Outra bilionária\n\n" +
                "Resposta: ");
        respDois = scan.nextLine();

        System.out.printf("\n" +
                "(3) Essa pessoa é legal?\n\n" +
                "a) Com certeza\n" +
                "b) Sim!\n" +
                "c) Não\n" +
                "d) Chato pra caramba\n\n" +
                "Resposta: ");
        respTres = scan.nextLine();

        if(respUm.startsWith("a") || respUm.startsWith("b")) somatoria++;
        if(respDois.startsWith("c") || respDois.startsWith("b")) somatoria++;
        if(respTres.startsWith("a") || respTres.startsWith("b")) somatoria++;

        System.out.println("Você acertou " + somatoria + " questões");
    };
}
