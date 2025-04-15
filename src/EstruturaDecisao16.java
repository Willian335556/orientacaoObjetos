import java.util.Scanner;

public class EstruturaDecisao16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero=teclado.NextInt();
        if(numero%8==0)
        System.out.println("o numero é divisivel por 8");
        else 
        System.out.println("O numero não é divisivel por 8");
        



    }
}
