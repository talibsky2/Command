// Invoker
public class CoffeeMan {
    Command latte;
    Command espresso;
    Command americano;

    public CoffeeMan(Command latte, Command espresso, Command americano) {
        this.latte = latte;
        this.espresso = espresso;
        this.americano = americano;
    }
    void makeLatte(){
        latte.execute();
    }
    void makeEspresso(){
        espresso.execute();
    }

    void makeAmericano (){
        americano.execute();
    }
}
