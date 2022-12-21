/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class LacoDeRepeticao {
    public static void main(String[] args) {
        //Declaracao de variáveis
        
        int op;
        
        //Criação e instância de um objeto de entrada
        
        
        
        //Entradas
        
        Scanner entrada=new Scanner(System.in);
        
        
        do{
            //Apresentação

            System.out.println("\n\t\t\t -- Imprima números ímpares : --\n");

            //Menu

            System.out.println("[1]. Números ímpares até 10");
            System.out.println("[2]. Números ímpares até 100");
            System.out.println("[3]. Números ímpares até 1000");
            System.out.println("[4]. Sair");

            //Opções do usuário

            System.out.print("\n\tOpção: ");
            op = entrada.nextInt();

            if (op == 1){

            //Entrada

            System.out.println("\nNúmeros ímpares até 10: \n");

            //Processamento

            for(int i = 0; i <= 10; i++){
                if((i % 2) != 0)
                    System.out.printf(" %d ", i);
            }
        }
            else if (op == 2) {

            //Entrada

            System.out.println("\nNúmeros ímpares até 100: \n");

            //Processamento

            for(int i = 0; i <= 100; i++){
                if((i % 2) != 0)
                    System.out.printf(" %d ", i);
            }
        }

            else if (op == 3) {

            //Entrada

            System.out.println("\nNúmeros ímpares até 1000: \n");

            //Processamento

               for(int i = 0; i <= 1000; i++){
                if((i % 2) != 0)
                    System.out.printf(" %d ", i);
            }
            System.out.println("\n\n");
            }    
            else if (op == 4) {

                //Entrada

                System.out.println("\nVocê escolheu sair!");
            }
        }while(op != 4);
    }
}