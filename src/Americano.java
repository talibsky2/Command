public class Americano implements Command{
    CoffeeMaker coffee;

    public Americano(CoffeeMaker coffee) {
        this.coffee = coffee;
    }

    @Override
    public void execute() {
        coffee.makeAmericano();
    }
}
