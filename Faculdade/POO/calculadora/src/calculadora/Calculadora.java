/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author hmart
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando um objeto do tipo de operação, para poder utilizar os métodos dessa classe 
        Operacao calculo = new Operacao();
        double resultado;
        System.out.println("Bem vindo a Calculadora");
        //Pegando o dados do teclado do usuário
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double v1 = teclado.nextDouble();
        
        System.out.println("Digite o Segundo valor: ");
        double v2 = teclado.nextDouble();
        
        
        System.out.println("Digite a operacação: ");
        String simbolo = teclado.next();
        
        // Pegando o resultado da função que calcula as operações
        resultado = calculo.escolha(v1, v2, simbolo);
        System.out.println("O valor escolhido foi de: " + v1 + " e " + v2 + ", A operacação escolhida foi " + simbolo + ", Resultado = " + resultado);
        
        
        
        
    }
    
}
