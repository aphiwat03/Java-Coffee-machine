
import java.util.Scanner;

public class CoffeeMachineTextUI {
    private CoffeeMachine coffeeMachine;
    private Scanner scanner;

    public CoffeeMachineTextUI() {
        coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        scanner = new Scanner(System.in);
    }

    public void doBuyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffee = scanner.nextLine();
        String message = coffeeMachine.makeCoffee(coffee);
        System.out.println(message);
    }

    public void doFilling() {
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        coffeeMachine.fillwater(water);

        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        coffeeMachine.fillmilk(milk);

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = scanner.nextInt();
        coffeeMachine.fillbeans(beans);
        System.out.println("Write how many disposable cups you want to add:");
        int cups = scanner.nextInt();
        coffeeMachine.fillcups(cups);
        System.out.println("Fill complete");

    }

    public void doTakeMoney() {
        String money = coffeeMachine.takecash();
        System.out.println("" + money);
    }



    public void doRemaining() {
        String message = coffeeMachine.showremaining();
        System.out.println(message);
    }


    public void execute() {
        boolean isRunning = true;
        while (isRunning) {
           System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    doBuyCoffee();
                    break;
                case "fill":
                    doFilling();
                    break;
                case "take":
                    doTakeMoney();
                    break;
                case "remaining":
                    doRemaining();
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:

            }
        }
    }

    public static void main(String[] args) {
        CoffeeMachineTextUI ui = new CoffeeMachineTextUI();
        ui.execute();
    }
}