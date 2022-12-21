package pct;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
    //Declaração de Variáveis
        int i;
       
        
    //Criação de instância do objeto de entrada
        Scanner entrada = new Scanner (System.in);
        
        
        
    //Apresentação 
        System.out.println("\n\t Descubra se seu número é Par ou Impar!");
    
        
    
    //Entradas
        System.out.print("\n\t Digite seu número: ");
        i = entrada.nextInt();
    
    //Processamento
        if (i % 2 == 0){
            System.out.println("\n\t Seu número é par!");
        } else {
            System.out.println("\n\t Seu número é impar!");
        }
        
    //Saída
        
    }
}