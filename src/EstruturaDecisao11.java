import java.util.Scanner;

public class EstruturaDecisao11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float totalVendas,salario;
        System.out.println("Digite o total de vendas");
        totalvendas=teclado.nextFloat();
        if(totalvendas>2000)
        salario=(float)(totalvendas*0.10+50);
        else
        salario=(float)(totalvendas*0.075);
        System.out.println("O salario é"+salario);





    }
}
