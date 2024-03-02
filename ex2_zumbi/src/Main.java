import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        if(z1.transfereVida(z1, 25,z2)){
            System.out.println("Transferencia concluida!");
        }else {
            System.out.println("Nao foi possivel realizar a transferencia");
        }

        System.out.println("Vida do z2: " + z2.mostraVida());
        System.out.println("Vida do z1: " + z1.mostraVida());

    }
}