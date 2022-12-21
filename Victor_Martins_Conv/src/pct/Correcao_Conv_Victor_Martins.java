

package pct;

import java.util.Scanner;

public class Correcao_Conv_Victor_Martins {

    public static void main(String[] args) { 
        //Declaração dos variáveis
        double cel, fah;
        int op;
    
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        do{
        //Apresentação
        System.out.println(" -- Conversor de Temperatura --\n");

        //Menu
        
        System.out.println("[1]. Converter de ºC para ºF");
        System.out.println("[2]. Converter de ºF para ºC");
        System.out.println("[3]. Sair\n");
        
        System.out.println("Faça sua escolha: ");
        op = entrada.nextInt();
        
        if(op==1){
        
        System.out.println("Informe a temperatura desejada para conversão");
        cel=entrada.nextDouble();
        
        //Processamento
        
        fah=9*cel/5+32;
        
        //Saída
    
        System.out.println("Sua variável equivale a : "+fah+"ºFahrenheit");
    
        }
        else if(op==2){
        
        System.out.println("Informe a temperatura desejada para conversão");
        fah=entrada.nextDouble();
        
        //Processamento
        
        cel = (fah-32) / 1.8;
        
        //Saída
    
        System.out.println("Sua variável equivale a : "+cel+"ºCelsius");
    
        }
        else if(op==3){
            System.out.println("Obrigada por usar meu conversor.");
        }
    }while(op!=3);
    }
}