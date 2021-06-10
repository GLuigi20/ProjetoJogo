package PacoteProjetoJogo;

    import java.util.Scanner;

    public class Jogo {

        // Autor: Gustavo Luigi de Almeida Oliveira, Fatec Osasco, Redes de Computadores - Tarde
        public static void main(String[] args) throws InterruptedException {
            String jogar; String dificuldade;
            Scanner teclado = new Scanner(System.in);
            BackEnd jogo = new BackEnd();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("                       JOGO DA ADIVINHAÇÃO                             ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.print("Deseja Jogar? (Sim/Nao): ");
            jogar = teclado.nextLine();
            while(jogar.equalsIgnoreCase("SIM") || jogar.equalsIgnoreCase("s")) {
                System.out.println("As Regras são as seguintes:\n1 - Tente adivinhar o número que eu pensar\n"
                        + "2 - Você tem 5 chances\n" + "3 - Lhe ajudarei com dicas");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("                           CARREGANDO                                  ");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                Thread.sleep(2500);
                System.out.print("Escolha a dificuldade: (Facil / Normal / Dificil): ");
                dificuldade = teclado.nextLine();
                if(dificuldade.equalsIgnoreCase("facil")) {
                    jogo.Facil();
                    System.out.print("Deseja Jogar? (Sim/Nao): ");
                    jogar = teclado.nextLine();
                }else if(dificuldade.equalsIgnoreCase("normal")){
                    jogo.Normal();
                    System.out.print("Deseja Jogar? (Sim/Nao): ");
                    jogar = teclado.nextLine();
                }else if(dificuldade.equalsIgnoreCase("dificil")) {
                    jogo.Dificil();
                    System.out.print("Deseja Jogar? (Sim/Nao): ");
                    jogar = teclado.nextLine();
                }else {
                    System.out.println("Não Existe essa Dificuldade!");
                    System.out.print("Deseja Jogar? (Sim/Nao): ");
                    jogar = teclado.nextLine();
                }
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("                       OBRIGADO POR JOGAR!!!                           ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        }

    }

