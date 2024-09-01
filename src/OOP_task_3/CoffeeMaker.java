package OOP_task_3;

public class CoffeeMaker {

    private boolean state;
    private String coffeeType;
    private double coffeeAmmount;

    public CoffeeMaker() {
        state = true;
        coffeeType = "Normal";
        coffeeAmmount = 10;
    }

    public String setCoffeeType() {
        if (state) {
            if (coffeeType.equals("Espresso")) {
                this.coffeeType = "Normal";
                return coffeeType;
            }
            this.coffeeType = "Espresso";
            return coffeeType;
        }
        return "Turn on coffee maker first";
    }
    public void setCoffeeAmmount(double coffeeAmmount) {
        if (state && coffeeAmmount >= 10 && coffeeAmmount <= 80) {
            this.coffeeAmmount = coffeeAmmount;
        }

    }

    public void switchOnOff() {
        if (state) {
            state = false;
        }else{
            state = true;
        }
    }

}
