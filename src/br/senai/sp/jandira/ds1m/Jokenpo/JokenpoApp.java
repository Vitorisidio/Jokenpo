package br.senai.sp.jandira.ds1m.Jokenpo;
import model.Jogo;

public class JokenpoApp {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("VAMOS JOGAR JOKENPO");
        System.out.println("----------------------");

        Jogo jogo = new Jogo();
        jogo.obterDados();

    }


}
