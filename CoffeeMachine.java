
public class CoffeeMachine {
    private int beans;
    private int cash;
    private int cups;
    private int milk;
    private int water;

    public CoffeeMachine(int water, int milk, int beans, int cups, int cash) {
        this.beans = beans;
        this.cash = cash;
        this.cups = cups;
        this.milk = milk;
        this.water = water;
    }

    public boolean canMakeCoffee(int beansNeeded, int milkNeeded, int waterNeeded) {
        return beans >= beansNeeded && milk >= milkNeeded && water >= waterNeeded && cups >=1;
    }

    public void fillbeans(int beans) {
        this.beans += beans;
    }

    public void fillcups(int cups) {
        this.cups += cups;
    }

    public void fillmilk(int milk) {
        this.milk += milk;
    }

    public void fillwater(int water) {
        this.water += water;
    }

    public String makeCoffee(String coffee) {
        String message = "";
        switch(coffee.toLowerCase()) {
            case "1":
                if (canMakeCoffee(16, 0, 250)) {
                    message = "I have enough resources, making you a coffee!";
                    beans -= 16;
                    water -= 250;
                    cups--;
                    cash += 4;
                } else {
                    message = "Sorry, not enough resources!";
                }
                break;
            case "2":
                if (canMakeCoffee(20, 75, 350)) {
                    message = "I have enough resources, making you a coffee!";
                    beans -= 20;
                    milk -= 75;
                    water -= 350;
                    cups--;
                    cash += 7;
                } else {
                    message = "Sorry, not enough resources!";
                }
                break;
            case "3":
                if (canMakeCoffee(12, 100, 200)) {
                    message = "I have enough resources, making you a coffee!";
                    beans -= 12;
                    milk -= 100;
                    water -= 200;
                    cups--;
                    cash += 6;
                } else {
                    message = "Sorry, not enough resources!";
                }
                break;
            default:

        }
        return message;
    }
    public String showremaining() {
        return String.format("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money", water, milk, beans, cups, cash);
    }

    public String takecash() {
        String message = String.format("I gave you $%d", cash);
        cash = 0;
        return message;
    }
}