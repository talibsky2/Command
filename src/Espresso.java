public class Espresso implements Command{
    CoffeeMaker coffee;

    public Espresso(CoffeeMaker coffee) {
        this.coffee = coffee;
    }
    @Override
    public void execute() {
        coffee.makeEspresso();
    }
}
