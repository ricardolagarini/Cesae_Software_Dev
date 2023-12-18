package JogoVelha;

import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';
    private static boolean jogoAtivo = true;

    public static void main(String[] args) {
        inicializarTabuleiro();
        exibirTabuleiro();

        while (jogoAtivo) {
            realizarJogada();
            exibirTabuleiro();
            verificarVencedor();
            alternarJogador();
        }
    }

    // Inicializa o tabuleiro com espaços em branco
    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro atual do jogo da velha
    private static void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
    }

    // Realiza a jogada do jogador atual
    private static void realizarJogada() {
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;

        do {
            System.out.print("Jogador " + jogadorAtual + ", informe a linha (0-2): ");
            linha = scanner.nextInt();
            System.out.print("Jogador " + jogadorAtual + ", informe a coluna (0-2): ");
            coluna = scanner.nextInt();
        } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = jogadorAtual;
    }

    // Verifica se há um vencedor ou se o jogo empatou
    private static void verificarVencedor() {
        if (verificarLinhas() || verificarColunas() || verificarDiagonais()) {
            jogoAtivo = false;
            System.out.println("Jogador " + jogadorAtual + " venceu!");
        } else if (verificarEmpate()) {
            jogoAtivo = false;
            System.out.println("O jogo empatou!");
        }
    }

    // Verifica as linhas para encontrar um vencedor
    private static boolean verificarLinhas() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    // Verifica as colunas para encontrar um vencedor
    private static boolean verificarColunas() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    // Verifica as diagonais para encontrar um vencedor
    private static boolean verificarDiagonais() {
        return (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual);
    }

    // Verifica se houve um empate
    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Alterna entre os jogadores 'X' e 'O'
    private static void alternarJogador() {
        if (jogadorAtual == 'X') {
            jogadorAtual = 'O';
        } else {
            jogadorAtual = 'X';
        }
    }
}

