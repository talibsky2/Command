public class Latte implements Command{
    CoffeeMaker coffee;

    public Latte(CoffeeMaker coffee) {
        this.coffee = coffee;
    }
    @Override
    public void execute() {
        coffee.makeLatte();
    }
}
