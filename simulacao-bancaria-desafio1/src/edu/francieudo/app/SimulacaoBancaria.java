package edu.francieudo.app;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true){

            System.out.println("Seja bem vindo! Escolha umas das opções abaixo");
            System.out.println("----------------------------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Fazer Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - encerrar operação");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para o saque!");
                    double valorSaque = scanner.nextDouble();

                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
            
        }

        
    }
}
