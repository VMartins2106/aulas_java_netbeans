/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class CalcJuros {
    public static void main(String[] args) {
        //Declaração de variáveis
        double c, i, n, j; // valores
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros Simples --\n");
        
        //Entradas
        System.out.println("\n\t Informe o Capital: \t ");
    c = entrada.nextInt();
        System.out.println("\n\t Informe a Taxa: \t ");
    i = entrada.nextInt();
        System.out.println("\n\t Informe o Período: \t ");
    n = entrada.nextInt();
        
        //Processamento
        
        j = c * i * n/100;
        
        //Saída
        
        PrintStream printf = System.out.printf("\n\t o valor do juros é: " + j + "\n\t");   
    }
    
}
