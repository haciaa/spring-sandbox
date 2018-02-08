package pl.sages.sandbox.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
//@Lazy
public class Lunch implements Meal {
    @Autowired
    @CustomQualifier
    private Beverage beverage;

    @Resource
    private List<String> ingrediens;

    @Loggable
    public void eatMe(int speed) {
        beverage.drinkMe();
        System.out.print("eating lunch consisting of:");
        ingrediens.forEach(s->System.out.print(" - " + s));
//        ingrediens.forEach(System.out::println);
    }

    @PostConstruct
    public void construct() {
        System.out.print("Lunch created\n");
    }
}
