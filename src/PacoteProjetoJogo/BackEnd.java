package PacoteProjetoJogo;

import java.util.Random;
import java.util.Scanner;

    // Autor: Gustavo Luigi de Almeida Oliveira, Fatec Osasco, Redes de Computadores - Tarde
    public class BackEnd {
        private int numero;
        private int palpite = -1;
        private int chances = 0;
        private Random aleatorio = new Random();
        private Scanner teclado = new Scanner(System.in);

        public void Facil() {
            this.numero = aleatorio.nextInt(10);
            System.out.println("Pensei em um número de 0 a 10");
            while(palpite != numero && chances < 6) {
                chances++;
                if(chances > 5) {
                    System.out.println("Desculpe, mais você não conseguiu acertar :(");
                    chances -= 1;
                    break;
                }
                System.out.print("Palpite: ");
                palpite = teclado.nextInt();
                if(palpite > numero) {
                    System.out.println("É Menor!");
                }else if(palpite < numero) {
                    System.out.println("É Maior!");
                }
            }if(palpite == numero && chances < 6) {
                System.out.println("Parabéns, você  acertou!!!");
            }
            System.out.println("Total de Chances: " + chances);
            chances = 0;
        }
        public void Normal() {
            this.numero = aleatorio.nextInt(15);
            System.out.println("Pensei em um número de 0 a 15");
            while(palpite != numero && chances <= 5) {
                chances++;
                if(chances > 5) {
                    System.out.println("Desculpe, mais você não conseguiu acertar :(");
                    chances -= 1;
                    break;
                }
                System.out.print("Palpite: ");
                palpite = teclado.nextInt();
                if(palpite > numero) {
                    System.out.println("É Menor!");
                }else if(palpite < numero) {
                    System.out.println("É Maior!");
                }
            }
            if(palpite == numero && chances < 6) {
                System.out.println("Parabéns, você  acertou!!!");
            }
            System.out.println("Total de Chances: " + chances);
            chances = 0;
        }
        public void Dificil() {
            this.numero = aleatorio.nextInt(20);
            System.out.println("Pensei em um número de 0 a 20");
            while(palpite != numero && chances <= 5) {
                chances++;
                if(chances > 5) {
                    System.out.println("Desculpe, mais você não conseguiu acertar :(");
                    chances -= 1;
                    break;
                }
                System.out.print("Palpite: ");
                palpite = teclado.nextInt();
                if(palpite > numero) {
                    System.out.println("É Menor!");
                }else if(palpite < numero) {
                    System.out.println("É Maior!");
                }
            }
            if(palpite == numero && chances < 6) {
                System.out.println("Parabéns, você  acertou!!!");
            }
            System.out.println("Total de Chances: " + chances);
            chances = 0;
        }
    }

