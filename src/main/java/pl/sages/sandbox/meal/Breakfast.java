package pl.sages.sandbox.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Breakfast implements Meal {


    private Beverage beverage;
    @Autowired
    @Qualifier("breakfast")
    private String mainMeal;

    @Autowired
    public Breakfast(@Qualifier("energizer") Beverage b) {
        this.beverage = b;
    }

    public void eatMe(int speed) {
        System.out.print("eating " + mainMeal + " ...\n");
        System.out.print("drinking beverage ...\n");
        beverage.drinkMe();
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getMainMeal() {
        return mainMeal;
    }

    public void setMainMeal(String mainMeal) {
        this.mainMeal = mainMeal;
    }
}
