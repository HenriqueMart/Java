/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

/**
 *
 * @author hmart
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1+n2:n2-n1;
        System.out.println(r);
        
        String nome = "Gustavo";
        String nome3 = "Gustavo";
        String teste = (nome.equals(nome3))?"Igual":"Diferente";
        System.out.println("Nome dos usuários são iguais: " + teste);
    }
    
}
