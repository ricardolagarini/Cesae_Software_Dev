package Ex_03;

import Ex_03.Enums.AreaFormacao;

public class Aluno extends  Pessoa{
    private Curso curso;
    private  double mediaNotas;
    private  String[ ][ ] pauta;         // String[ ][ ]-->>ArrayList<ArrayList<String>>

    public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas, String[][] pauta) {
        super(nome, anoNascimento, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
    }


    @Override
    public void obterFuncao() {
    }
    @Override
    public void imprimirHorario() {
    }
}
