package Ex_03;
import Ex_03.Enums.AreaFormacao;
import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<AreaFormacao> areaFormação;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, ArrayList<AreaFormacao> areaFormação, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.areaFormação = areaFormação;
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void obterFuncao() {
    }
    @Override
    public void imprimirHorario() {
    }








}
