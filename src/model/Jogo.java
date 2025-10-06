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

        System.out.println("Escolha uma opção:");
        System.out.println("(1) PEDRA");
        System.out.println("(2) PAPEL");
        System.out.println("(3) TESOURA");
        System.out.println("--------------------------------------");

        System.out.print("Digite a sua escolha:");
        jogador = leitor.nextInt();
        computador = random.nextInt(3)+1;

        partida();
    }

    public void partida(){

        if (jogador > 3){

            System.out.println("\n opção invalida Escolha novamente: \n");
            obterDados();

        }

        if (jogador == computador){

            resultado= "*** E M P A T E ***";

        } else if (( jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) ) {

            resultado= "*** V E N C E U ***";

        }else {
            resultado= "*** P E R D E U ***";
        }

        exibirResultados();
    }

    public void exibirResultados(){

        if (jogador == 1){
            escolhaJogador = "PEDRA";
        } else if (jogador == 2) {
            escolhaJogador = "PAPEL";
        }else if (jogador == 3){
            escolhaJogador = "TESOURA";
        }

        if (computador == 1){
            escolhaComputador = "PEDRA";
        } else if (computador == 2) {
            escolhaComputador = "PAPEL";
        }else if (computador == 3){
            escolhaComputador = "TESOURA";
        }

        System.out.println("\nVocê escolheu: " + escolhaJogador);
        System.out.println("O computador escolheu: " + escolhaComputador + "\n");
        System.out.println(resultado);


        jogarNovamente();
    }



    public void jogarNovamente(){
        Scanner leitor = new Scanner(System.in);
        String jogarDenovo;

        System.out.println("\n Jogar novamente (S/N)?");
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

