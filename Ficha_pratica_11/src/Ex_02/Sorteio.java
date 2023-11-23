package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

   private double premio;
    private ArrayList<Pessoas> participantes;


    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>();
    }

    public void addParticipantes(Pessoas novoParticipante) {
            if (novoParticipante.getIdade()>=18){
                this.participantes.add(novoParticipante);
                System.out.println("Participante "+novoParticipante.getNome() +" adicionado.");
            }else{
                System.out.println("Participante "+novoParticipante.getNome() +" é menor de idade.");
            }
    }


    public Pessoas sortear() { // nao pode ser void posi precisa de retorno
        Random random = new Random();
        int indiceVencedor = random.nextInt(0,participantes.size());
        return participantes.get(indiceVencedor);

    }

    public void imprimirListaParticipantes() {
        int contador = 1;

        System.out.println("\n***** Lista de Participantes *****");
        for (Pessoas pessoaAtual : this.participantes) {
            System.out.print("Participante " + contador++ + ": ");
            pessoaAtual.exibirDetalhes();
        }

    }









}
