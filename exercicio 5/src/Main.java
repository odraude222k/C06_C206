import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int numGerado;
        int numadvinhado;

        numGerado = rand.nextInt(10) + 1;

        do{
            System.out.println("Qual o número que estou pensando: ");
            numadvinhado = entrada.nextInt();

            if(numadvinhado != numGerado){
                System.out.println("Errou");
            }
        }while(numGerado != numadvinhado);

        System.out.println("Acertou");

        entrada.close();
    }
}