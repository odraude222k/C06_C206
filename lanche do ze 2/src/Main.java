import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de lanches da primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o numero de lanches da segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o numero de lanches da terceira hora: ");
        int lanche3 = entrada.nextInt();
        int soma;
        float media;

        soma = lanche1+lanche2+lanche3;

        media = soma/3.0f; // colocar f caso seja float


        System.out.println("O total de lanches foi: " +soma);
        System.out.println("A media de lanches foi: " +media);

        entrada.close();

    }
}