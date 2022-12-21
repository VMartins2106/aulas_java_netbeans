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
public class CalcSimples {
    
    public static void main(String[] args) {
                //Declaração de variáveis
        int num1, num2, total, sair;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);


        do {            
            //Apresentação
            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            //menu
            System.out.println("\n\tMenu\n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Resto da Divisão");
            System.out.print("\n\n-Escolha uma Opção: ");
            int op = entrada.nextInt();

            switch(op){

                case 1: 
                    //Soma simples
                    System.out.println("\tSoma simples: ");

                    //Entradas
                    System.out.print("Informe um número para soma: ");
                    num1 = entrada.nextInt();
                    System.out.print("Informe outro número para somar: ");
                    num2 = entrada.nextInt();

                    //Processamento
                    total = num1 + num2;

                    //Saída
                    System.out.printf("\n\t %d + %d = %d\n", num1, num2, total);
                break;
                case 2:

                    //Subtração
                    System.out.println("\tSubtração: ");

                    //Entradas
                    System.out.print("Informe um número para subtração: ");
                    num1 = entrada.nextInt();
                    System.out.print("Informe outro número para subtrair: ");
                    num2 = entrada.nextInt();

                    //Processamento
                    total = num1 - num2;

                    //Saída
                    System.out.printf("\n\t %d - %d = %d\n", num1, num2, total);
                    break;

                case 3:
                    //Multiplicação
                    System.out.println("\tMultiplicação: ");

                    //Entradas
                    System.out.print("Informe um número para multiplicação: ");
                    num1 = entrada.nextInt();
                    System.out.print("Informe outro número multiplicar: ");
                    num2 = entrada.nextInt();
                    //Processamento

                    total = num1 * num2; 

                    //Saída

                   System.out.printf("\n\t%d X %d = %d\n", num1,num2,total);
                   break;

                case 4:
                    //Divisão
                    System.out.println("\tDivisão: ");

                    //Entrada
                    System.out.print("Informe um número para divisão: ");
                    num1 = entrada.nextInt();
                    System.out.print("Informe outro número para dividir: ");
                    num2 = entrada.nextInt();
                    //Processamento

                    total = num1/num2;

                    //Saída

                    System.out.printf("\n\t%d / %d = %d\n", num1,num2,total);
                    break;

                case 5:
                    //Resto inteiro da divisão
                    System.out.println("\tResto: ");

                    //Entrada
                    System.out.print("Informe um número para determinar o resto: ");
                    num1 = entrada.nextInt();
                    System.out.print("Informe outro número: ");
                    num2 = entrada.nextInt();       
                    //Processamento

                    total = num1 % num2;

                    //Saída
                    System.out.printf("\n\tO resto da divisão %d / %d é %d\n", num1,num2,total);
                    break;
                default:
                    System.out.println("Opção Invalida!!!");
            }
            
            //menu de saida
            System.out.println("\nDeseja sair?");
            System.out.print("1=Sim 0=Não: ");
            sair = entrada.nextInt();
        } while (sair < 1);
        System.out.println("Encerrando sitema!!!");
    }
}
