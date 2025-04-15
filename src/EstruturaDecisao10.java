import java.util.Scanner;

public class EstruturaDecisao10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float altura,pesoideal;
        int sexo;
        
        System.out.println("Digite sua Altura");
        altura= teclado.nextFloat();
        
        System.out.println("Informe o sexo-1(F) ou 2(M)");
        sexo=teclado.nextInt();
        
        if(sexo==1){
        pesoideal=(float)((72.2*altura)-58);
        System.out.println("O peso ideal é"+pesoideal);
        }



    }
}
