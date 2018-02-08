package pl.sages.sandbox.meal;

import org.springframework.stereotype.Component;

@Component
@CustomQualifier
public class Coffee implements Beverage {
    public void drinkMe() {
        System.out.print("drinking coffee\n");
    }
}
