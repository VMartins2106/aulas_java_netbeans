

        package conversão;

import java.util.Scanner;

public class Conversão {

    public static void main(String[] args) { 
        //Declaração dos variáveis
        double cel, fah;
    
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
    
        //Apresentação
        System.out.println(" -- Conversor de Temperatura --\n");

        //Entradas
    
        System.out.println("Informe a temperatura desejada para conversão");
        cel=entrada.nextDouble();
        
        //Processamento
        
        fah=9*cel/5+32;
        
        //Saída
    
        System.out.println("Sua variável equivale a : "+fah+"ºFahrenheit");
    
    }
    
}
