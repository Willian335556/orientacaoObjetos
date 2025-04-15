import java.util.Scanner;

public class EstruturaDecisão9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float salariobase,salarioliquido,bonus;
        int idade;
        System.out.println("Digite o valor do salario base" );
        salariobase=teclado.nextFloat();
        System.out.println("Digite a idade");
        idade=teclado.nextInt()
        bonus=0
        if(salariobase>=1000&&idade>50);
        bonus=(float)(salariobase*0.10);
        else if=(salariobase<1000&&idade<=50);
        bonus=(float)(salariobase*0.05);
        salarioliquido=salariobase+bonus;
        System.out.println("o Salário Base é"+salariobase);
        System.out.println("o Salário liquido é"+salarioliquido);
        System.out.println("o bônus é"+bonus);




    }

}
