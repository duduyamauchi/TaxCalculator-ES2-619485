package com.company;
import java.lang.System;
import java.util.Scanner;
public class Main {

    public static double calculaIR (double salario){

       if (salario < 1903.99){
           return 0;
       } else if (salario < 2826.66){
           return salario*0.075;
       } else if (salario < 3751.06){
           return salario*0.15;
       } else if (salario < 4664.69){
           return  salario*0.225;
       } else{
           return salario*0.275;
       }

    }

    public static void main(String[] args) {
        System.out.println("Digite o seu salario: ");
        Scanner inUser = new Scanner(System.in);
        double salario = inUser.nextDouble();
        System.out.println("\nSua aliquota de IR é: " + calculaIR(salario));
    }
}
