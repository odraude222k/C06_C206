import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a NPA: ");
        int npa,np3;
        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Aprovado! ");
        }else {
            System.out.println("Ainda tem como");

            System.out.println("Digite a nota np3: ");
            np3 = entrada.nextInt();

            if((np3 + npa)/2 >= 50){
                System.out.println("aprovado");
            } else {
                System.out.println("reprovado");
            }
        }

        entrada.close();
    }
}