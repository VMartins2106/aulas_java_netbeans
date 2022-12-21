/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anobissexto;
import java.util.Scanner;
/**
 *
 * @author Win10
 */
public class AnoBissexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declaração de váriaveis
        int ano = 0;
    //Criação de instância do objeto de entrada
        Scanner entrada = new Scanner (System.in); 
    
    //Apresentação
        System.out.println("\n\t Descubra se o ano é bissexto ou não!");
    
    //Entrada
        System.out.println("\n\t Informe o ano desejado");
        ano = entrada.nextInt();
 
    //Processamento & Saída 
        if (ano % 4 != 0 && ano % 400 != 0){
            System.out.println("\n\t Este ano é normal");
        } else {
            System.out.println("\n\t Este ano é bissexto");
        }
    
   }
}
