/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacoes;
import java.util.Scanner;
/**
 *
 * @author Win10
 */
public class Estacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Declaração de variáveis
        int Dia, Mes;
        
       //Criação e instância do objeto
       Scanner entrada = new Scanner(System.in);
       
       //Apresentação
       System.out.println("\n\t Descubra a estação do ano da sua data!");
       
       //Entradas   
       System.out.println("\n\t Informe o dia desejado: ");
       Dia = entrada.nextInt();
       
       System.out.println("\n\t Informe o mês desejado: ");
       Mes = entrada.nextInt();
       
       //Processamento
       if ((Mes == 1) || (Mes == 2) || (Mes ==3)){
           System.out.println("\n\t Verão!");
       } else if ((Mes == 4) || (Mes == 5) || (Mes == 6)){
           System.out.println("\n\t Outono!");
       } else if ((Mes == 7) || (Mes == 8) || (Mes == 9)){
           System.out.println("\n\t Inverno!");
       } else if ((Mes == 10) || (Mes == 11) || (Mes == 12)){
           System.out.println("\n\t Primavera!");
       }       
    }
 }
