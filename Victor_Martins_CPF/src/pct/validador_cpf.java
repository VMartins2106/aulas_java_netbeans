/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
import java.util.Scanner;

/**
 *
 * @author manager
 */
public class validador_cpf {
    public static void main(String[] args) {
        
        System.out.println("\n\t\t\tValidador de CPF!\n");
        
        //Declaração de variáveis
        
        int soma = 0, indice = 0, d1, d2;
        String cpf;
        
        //Entrada
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu CPF: \n");
        cpf = entrada.next();
        
        //Processamento
        
        //Processamento do digito 1
        
        //Laço de repetição para calculo do digito validador 1

        if(cpf.length() == 11){
            for(int i=10;i>=2;i--){
                soma += Character.getNumericValue(cpf.charAt(indice)) * i;
                indice++;
            }

        //Resto da divisão por 11

        d1 = soma % 11;

        //Se D1 é maior ou igual a 2

        if(d1>=2){
            d1 = 11 - d1;
        }
            else{
            d1 = 0;
        }

        //Processamento do digito 2

        //Laço de repetição para calculo do digito validador 2

        soma = 0;
        indice = 0;
        for(int i=11;i>=2;i--){
            soma += Character.getNumericValue(cpf.charAt(indice)) * i;
            indice++;
        }

        //Resto da divisão por 11

        d2 = soma % 11;

        //Se D2 é maior ou igual a 2

        if(d2 >= 2){
            d2 = 11 - d2;
        }
            else{
            d2 = 0;
        }
        //Saída
        
        if(d1 == Character.getNumericValue(cpf.charAt(9)) && d2 == Character.getNumericValue(cpf.charAt(10))){
            System.out.println("CPF válido.");
            }
        else 
                System.err.println("CPF inválido.");
        }
        else{
                System.err.println("Cpf " + cpf + "possui a quantidade de digitos incorreta.");
            }
    }
}