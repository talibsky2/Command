public class Test {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        CoffeeMan coffeeMan = new CoffeeMan(new Latte(coffeeMaker), new Espresso(coffeeMaker), new Americano(coffeeMaker
        ));
        coffeeMan.makeEspresso();
        coffeeMan.makeLatte();
        coffeeMan.makeAmericano();
    }
}