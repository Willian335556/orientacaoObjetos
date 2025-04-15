package EstruturadeRepetição;

public class ex4 {
    public static void main(String[] args) {
        int paisA=90000;
        int paisB=200000;
        int i =0;
        //Degug
        System.out.println("País a"+(paisA/100)*3);
        System.out.println("País B"+(paisB/100)*1.5);
    

        while(paisA<= paisB){
           paisA+=(paisA/100)*3;
            paisB += (paisB/100) * 1.5;
            System.out.println("A"+paisA);
            System.out.println("B"+paisB);
            i++;
            System.out.println("Tempo"+i);



        }










    }

}










