package edu.francieudo.app;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para o limite diario");
        double limiteDiario = scanner.nextDouble();
        
        for(int i=0; ; i++){

            System.out.println("Digite o valor para o saque");
            double valorSaque = scanner.nextDouble();

            if(valorSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }else if(valorSaque ==0){
                
                System.out.println("Transacoes encerradas.");
                break;

            }else{
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }

        }

        scanner.close();
    }
}
