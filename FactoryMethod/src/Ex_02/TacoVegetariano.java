package Ex_02;

public class TacoVegetariano extends Taco{

    @Override
    public void bake() {
        System.out.println("A cozinhar taco vegetariano");
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco vegetariano");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco vegetariano");

    }
}
