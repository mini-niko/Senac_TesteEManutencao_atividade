package org.example;

import java.util.Scanner;

public class cantina {
    public static void run() {
        Scanner scan = new Scanner(System.in);

        int resp1, resp2;

        System.out.printf("Responda com 1 [sim] ou 2 [não]:\n\nVocê está com fome?\nResposta: ");
        resp1 = scan.nextInt();

        System.out.printf("\nVocê tem dinheiro?\nResposta: ");
        resp2 = scan.nextInt();

        System.out.println();

        if(resp1 == 1 && resp2 == 1) {
            System.out.printf("Pode vir comer, tenho muitos lanches ;)");
        }
        else if(resp1 == 2){
            System.out.printf("Pode guardar o dinheiro, vai fazer bem!");
        }
        else if(resp2 == 2){
            System.out.printf("E aqueles 200 que te emprestei? O_o");
        }
        else if(resp1 == 2 && resp2 == 2){
            System.out.printf("Que bom! Agora só estudar pra crescer :)");
        }
    };
}
