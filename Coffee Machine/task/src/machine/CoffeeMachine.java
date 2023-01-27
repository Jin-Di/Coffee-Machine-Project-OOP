package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachineActivity coffeeMachineActivity = new CoffeeMachineActivity(400, 540, 120, 9, 550);
        String action;
        do {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            action = sc.next();
            switch (action) {
                case "remaining" -> coffeeMachineActivity.remaining();
                case "buy" -> coffeeMachineActivity.buy();
                case "fill" -> coffeeMachineActivity.fill();
                case "take" -> coffeeMachineActivity.take();
                default -> {
                }
            }
        } while (!action.equals("exit"));
    }
}
class CoffeeMachineActivity {
    private int waterAvailable;
    private int milkAvailable;
    private int coffeeBeanAvailable;
    private int cupAvailable;
    private int moneyAvailable;
    static Scanner sc = new Scanner(System.in);
    public CoffeeMachineActivity(int waterAvailable, int milkAvailable, int coffeeBeanAvailable, int cupAvailable, int moneyAvailable) {
        this.waterAvailable = waterAvailable;
        this.milkAvailable = milkAvailable;
        this.coffeeBeanAvailable = coffeeBeanAvailable;
        this.cupAvailable = cupAvailable;
        this.moneyAvailable = moneyAvailable;
    }

    void remaining(){
        System.out.printf("\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money\n",
                waterAvailable, milkAvailable, coffeeBeanAvailable, cupAvailable, moneyAvailable);
    }

    void buy(){
        System.out.println("What do you want to buy? 1 -  espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = sc.next();
        switch (choice) {
            case "1" -> {
                if (check(choice)) {
                    waterAvailable -= 250;
                    coffeeBeanAvailable -= 16;
                    moneyAvailable += 4;
                    cupAvailable--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
            }
            case "2" -> {
                if (check(choice)) {
                    waterAvailable -= 350;
                    milkAvailable -= 75;
                    coffeeBeanAvailable -= 20;
                    moneyAvailable += 7;
                    cupAvailable--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
            }
            case "3" -> {
                if (check(choice)) {
                    waterAvailable -= 200;
                    milkAvailable -= 100;
                    coffeeBeanAvailable -= 12;
                    moneyAvailable += 6;
                    cupAvailable--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
            }
            //back
        }
    }

    boolean check(String choice) {
        switch (choice) {
            //espresso
            case "1" -> {
                if (waterAvailable < 250) {
                    System.out.println("Sorry not enough water!");
                } else if (coffeeBeanAvailable < 16) {
                    System.out.println("Sorry not enough coffee beans!");
                } else if (cupAvailable < 1) {
                    System.out.println("Sorry not enough cup!");
                } else {
                    return true;
                }
                //will return false if it's not true
                return false;
            }
            case "2" -> {
                //latte
                if (waterAvailable < 350) {
                    System.out.println("Sorry not enough water!");
                } else if (milkAvailable < 75) {
                    System.out.println("Sorry not enough milk!");
                } else if (coffeeBeanAvailable < 20) {
                    System.out.println("Sorry not enough coffee beans!");
                } else if (cupAvailable < 1) {
                    System.out.println("Sorry not enough cup!");
                } else {
                    return true;
                }
                return false;
            }
            case "3" -> {
                //cappuccino
                if (waterAvailable < 200) {
                    System.out.println("Sorry not enough water!");
                } else if (milkAvailable < 100) {
                    System.out.println("Sorry not enough milk!");
                } else if (coffeeBeanAvailable < 12) {
                    System.out.println("Sorry not enough coffee beans!");
                } else if (cupAvailable < 1) {
                    System.out.println("Sorry not enough cup!");
                } else {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    void fill(){
        System.out.println("Write how many ml of water you want to add: ");
        waterAvailable += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milkAvailable += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeanAvailable += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        cupAvailable += sc.nextInt();
    }
    void take(){
        System.out.println("I gave you $" + moneyAvailable);
        moneyAvailable = 0;
    }
}
