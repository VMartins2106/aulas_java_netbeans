/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Signos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declaração de váriaveis
        int dia = 31;
        int mes = 12;
    //Criação de instância do objeto de entrada
        Scanner entrada = new Scanner (System.in); 
    
    //Apresentação
        System.out.println("\n\t Descubra seu signo!");
    
    //Entrada
        System.out.println("\n\t Informe o dia que você nasceu:");
        dia = entrada.nextInt();
        System.out.println("\n\t Informe o mês que você nasceu:");
        mes = entrada.nextInt();
 
    //Processamento & Saída 
    if ((mes==3) && (dia>=21) || (mes==4) && (dia<=20))
            System.out.println("\n\t Áries!");
    
        else if (((mes==4) && (dia>=21)) || ((mes==5) && (dia<=20)))
            System.out.println("\n\t Touro!");
     
        else if (((mes==5) && (dia>=21)) || ((mes==6) && (dia<=20)))
            System.out.println("\n\t Gemêos!");
     
        else if (((mes==6) && (dia>=21)) || ((mes==7) && (dia<=22)))
            System.out.println("\n\t Câncer!");
     
        else if (((mes==7) && (dia>=23)) || ((mes==8) && (dia<=22)))
            System.out.println("\n\t Leão!");
     
        else if (((mes==8) && (dia>=23)) || ((mes==9) && (dia<=22)))
            System.out.println("\n\t Virgem!");
     
        else if (((mes==9) && (dia>=23)) || ((mes==10) && (dia<=22)))
            System.out.println("\n\t Libra!");
     
        else if (((mes==10) && (dia>=23)) || ((mes==11) && (dia<=21)))
            System.out.println("\n\t Escorpião!");
     
        else if (((mes==11) && (dia>=22)) || ((mes==12) && (dia<=21)))
            System.out.println("\n\t Sagitário!");
     
        else if (((mes==12) && (dia>=22)) || ((mes==1) && (dia<=20)))
            System.out.println("\n\t Capricórnio!");
     
        else if (((mes==1) && (dia>=21)) || ((mes==2) && (dia<=18)))
            System.out.println("\n\t Aquário!");
     
        else if (((mes==2) && (dia>=19)) || ((mes==3) && (dia<=20)))
            System.out.println("\n\t Peixes!");
        else
            System.out.println("\n\t Erro : mês ou dia inválido");
    }
}