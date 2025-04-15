import java.util.Scanner;

public class EstruraDecisão8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota 1,nota 2,nota 3,media;

        System.out.println("informe nota 1");
        nota1=teclado.nextFloat();
        System.out.println("informe nota 2");
        nota2=teclado.nextFloat();
        System.out.println("informe nota 3");
        nota3=teclado.nextFloat();
        media=(nota1,nota2,nota3)/3;
        if(media>=7);
        System.out.println("Aprovado:"+media);
        else if(media>=5);
        System.out.println("Recuparação:"+media);
        else
        System.out.println("Reprovado"+media);


    }

}
