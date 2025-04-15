import java.util.Scanner;

public class EstruturaDecisao6 {
    
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int n1,n2;



    System.err.println("Digite um Número");
    n1 = teclado.nextInt();

    System.err.println("Digite o segundo Número");
    n2 = teclado.nextInt();

    if(n1 ==n2){
        System.err.println("São iguais");
    }else{
    System.out.println("São Difentes");

    }



}
}
