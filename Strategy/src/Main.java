public class Main {
    public static void main(String[] args) {
        Jogador player = new Jogador("Vitor",new AtaqueMagico());

        player.atacar();

        player.setEstrategiaAtaque(new AtaqueEspada());
        player.atacar();
    }
}