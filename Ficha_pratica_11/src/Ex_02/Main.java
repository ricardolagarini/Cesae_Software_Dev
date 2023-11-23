package Ex_02;


public class Main {
    public static void main(String[] args) {

        Pessoas participante1 = new Pessoas("Astrogildo", 25, "astro@lala.com", 932568417);
        Pessoas participante2 = new Pessoas("Pafuncio", 50, "superpafa@lala.com", 932561515);
        Pessoas participante3 = new Pessoas("Cerejo", 16, "paozinho@lala.com", 781515513);
        Pessoas participante4 = new Pessoas("Calabreso", 26, "kako@lala.com", 985515512);
        Pessoas participante5 = new Pessoas("Mirenalva", 35, "mimi@lala.com", 781255897);

        Sorteio euromilhoes = new Sorteio(1500000);

        euromilhoes.addParticipantes(participante1);
        euromilhoes.addParticipantes(participante2);
        euromilhoes.addParticipantes(participante3);
        euromilhoes.addParticipantes(participante4);
        euromilhoes.addParticipantes(participante5);

        euromilhoes.imprimirListaParticipantes(); // imprimir os participantes validos

        euromilhoes.sortear(); 
        Pessoas vencedor = euromilhoes.sortear();

        System.out.println("\n****** Grande Vencedor ******");
        vencedor.exibirDetalhes();




    }
}
