package pl.sages.sandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sages.sandbox.meal.Meal;

public class Launcher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        System.out.print("context created\n");

        Meal meal = context.getBean("lunch", Meal.class);
        meal.eatMe(250);

        System.out.print("\n");

        Meal meal2 = context.getBean("breakfast", Meal.class);
        meal2.eatMe(300);
    }
}
