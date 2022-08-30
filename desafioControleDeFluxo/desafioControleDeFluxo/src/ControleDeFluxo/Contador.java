package ControleDeFluxo;

import ControleDeFluxo.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador extends Exception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro : ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro : ");
        int numeroDois = scan.nextInt();

        try
        {
            contar(numeroUm,numeroDois);
        }catch (ParametrosInvalidosException exception)
        {
             System.out.println("----O segundo parâmetro deve ser maior que o primeiro---- ");
            
             System.out.println("Digite o primeiro parâmetro : ");
             numeroUm = scan.nextInt();
             System.out.println("Digite o segundo parâmetro : ");
             numeroDois = scan.nextInt();

            int cont = 0;

            int contagem = numeroDois - numeroUm ;
            for( int i =1; i<= contagem; i++)
            {
                System.out.println("Imprimindo o número "+ i);
                cont += (i);

            }
            System.out.println("Imprimindo a soma da diferença dos numeros : "+cont);

             
        }
    }

    static void contar(int numeroUm , int numeroDois)throws ParametrosInvalidosException
    {
        int contagem = numeroDois - numeroUm ;

        if(contagem<0)
        {
            throw new ParametrosInvalidosException();
        }

        int cont = 0;
        for( int i =1; i<= contagem; i++)
        {
            System.out.println("Imprimindo o número : "+ i);
            cont += (i);

        }
        System.out.println("Imprimindo a soma da diferença dos numeros : "+cont);
    }
}
