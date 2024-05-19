package edu.francieudo.app;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if(saldo >= saque){
            System.out.println("Transação realizada com sucesso.");
        }else{

            double excedente = saque - saldo;

            if(excedente > limiteChequeEspecial){
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }else{
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            }
        }

        scanner.close();
    }

}
