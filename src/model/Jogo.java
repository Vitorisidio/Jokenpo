package model;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

    int jogador;
    int computador;
    String escolhaJogador;
    String escolhaComputador;
    String resultado;

    public void obterDados(){

        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--------------------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("--------------------------------------");

        System.out.print("Digite a sua escolha: ");
        jogador = leitor.nextInt();
        computador = random.nextInt(3)+1;

        partida();
    }

    public void partida(){


        if (jogador == computador){

            resultado= "***EMPATE***";

        } else if (( jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) ) {

            resultado= "***O JOGADOR VENCEU***";

        }else {
            resultado= "***O JOGADOR PERDEU***";
        }

        exibirResultados();
    }

    public void exibirResultados(){

        if (jogador == 1){
            escolhaJogador = "PEDRA";
        } else if (jogador == 2) {
            escolhaJogador = "PAPEL";
        }else {
            escolhaJogador = "TESOURA";
        }

        if (computador == 1){
            escolhaComputador = "PEDRA";
        } else if (computador == 2) {
            escolhaComputador = "PAPEL";
        }else {
            escolhaComputador = "TESOURA";
        }

        System.out.println("O JOGADOR ESCOLHEU: " + escolhaJogador);
        System.out.println("O COMPUTADOR ESCOLHEU: " + escolhaComputador);
        System.out.println("RESULTADO: " + resultado);


        jogarNovamente();
    }



    public void jogarNovamente(){
        Scanner leitor = new Scanner(System.in);
        String jogarDenovo;

        System.out.println("Jogar novamente (S/N)?");
        jogarDenovo= leitor.nextLine();
        if (jogarDenovo.equals("s") || jogarDenovo.equals  ("S") ) {
            System.out.println("--------------------");
            System.out.println("RENICIANDO");
            System.out.println("--------------------");
            obterDados();
        }else {

            System.out.println("--------------------");
            System.out.println("FINALIZANDO APLICAÇÃO");
            System.out.println("--------------------");

        }





    }

}

