package EstruturadeRepeticaoWhile5.java;

import java.util.Scanner;

public class EstruturaRepeticaoWhile5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        float notas;
        float soma = 0;
        while (i<= 4) {
            System.out.println("Digite a nota "+ i);
            notas = teclado.nextFloat();
            soma += notas;
            i++; 
            
        }
        System.out.println("A média é:"+soma/4);


        }

    }



