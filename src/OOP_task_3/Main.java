package OOP_task_3;

public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.switchOnOff();
        System.out.println(coffeeMaker.setCoffeeType());

        coffeeMaker.switchOnOff();
        System.out.println(coffeeMaker.setCoffeeType());
        System.out.println(coffeeMaker.setCoffeeType());

    }


}
