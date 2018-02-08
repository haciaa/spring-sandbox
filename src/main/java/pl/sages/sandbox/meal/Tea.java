package pl.sages.sandbox.meal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("energizer")
public class Tea implements Beverage {
    @Override
    public void drinkMe() {
        System.out.print("drinking coffee\n");
    }
}
