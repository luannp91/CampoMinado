package projeto.curso.cm;

import projeto.curso.cm.modelo.Tabuleiro;
import projeto.curso.cm.visao.TabuleiroConsole;

public class App {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
