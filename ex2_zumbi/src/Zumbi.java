public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){

        return vida;

    }

    boolean transfereVida (Zumbi zumbiAlvo, double quantia, Zumbi zumbicomido){

        if(zumbicomido.vida > 0){
            zumbiAlvo.vida += quantia;
            zumbicomido.vida -= quantia;
            return true;
        } else {
            return false;
        }

    }
}
