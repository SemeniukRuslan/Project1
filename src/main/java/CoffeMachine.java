import java.util.Scanner;

class CoffeeMachine {
    public static void main(String[] args) {
        calculateIngr();
    }

    public static void calculateIngr() {

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int waterInMachine = 400;
        int milkInMachine = 540;
        int beansCoffeeInMachine = 120;
        int cupsInMachine = 9;
        int moneyInMachine = 550;

        while (!command.contains("exit")) {

            if (command.contains("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                Scanner scanner1 = new Scanner(System.in);
                String selectCoffee = scanner1.next();
                System.out.println();

                if (selectCoffee.contains("1")) {
                    if (waterInMachine < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else {
                        waterInMachine = waterInMachine - 250;
                        beansCoffeeInMachine = beansCoffeeInMachine - 16;
                        cupsInMachine = cupsInMachine - 1;
                        moneyInMachine = moneyInMachine + 4;
                        System.out.println("I have enough resources, making you a coffee!");
                    }

                } else if (selectCoffee.contains("2")) {
                    if (waterInMachine <= 350) {
                        System.out.println("Sorry, not enough water!");
                    } else {
                        waterInMachine = waterInMachine - 350;
                        milkInMachine = milkInMachine - 75;
                        beansCoffeeInMachine = beansCoffeeInMachine - 20;
                        cupsInMachine = cupsInMachine - 1;
                        moneyInMachine = moneyInMachine + 7;
                        System.out.println("I have enough resources, making you a coffee!");
                    }

                } else if (selectCoffee.contains("3")) {
                    if (waterInMachine < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else {
                        waterInMachine = waterInMachine - 200;
                        milkInMachine = milkInMachine - 100;
                        beansCoffeeInMachine = beansCoffeeInMachine - 16;
                        cupsInMachine = cupsInMachine - 1;
                        moneyInMachine = moneyInMachine + 6;
                        System.out.println("I have enough resources, making you a coffee!");
                    }

                } else if (selectCoffee.contains("back")) {
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    command = scanner.next();
                } else{
                    System.out.println("Wrong input");
                }

            } else if (command.contains("fill")) {
                System.out.println();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Write how many ml of water you want to add: ");
                int waterToAdd = scanner2.nextInt();
                waterInMachine = waterToAdd + waterInMachine;
                System.out.println("Write how many ml of milk you want to add: ");
                int milkToAdd = scanner2.nextInt();
                milkInMachine = milkToAdd + milkInMachine;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int coffeeBeansToAdd = scanner2.nextInt();
                beansCoffeeInMachine = coffeeBeansToAdd + beansCoffeeInMachine;
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int cupsToAdd = scanner2.nextInt();
                cupsInMachine = cupsToAdd + cupsInMachine;
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                command = scanner.next();

            } else if (command.contains("take")) {
                System.out.println("I gave you $" + moneyInMachine);
                moneyInMachine = 0;
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                command = scanner.next();

            } else if (command.contains("remaining")) {
                System.out.println();
                System.out.println("The coffee machine has:\n" +
                        waterInMachine + " ml of water\n" +
                        milkInMachine + " ml of milk\n" +
                        beansCoffeeInMachine + " g of coffee beans\n" +
                        cupsInMachine + " disposable cups\n" +
                        moneyInMachine + "$ of money");
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                command = scanner.next();
            }
        }
    }
}
