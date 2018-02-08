package pl.sages.sandbox.meal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MealConfiguration {
    @Bean(value="ingrediens")
    public List<String> getIngrediens() {
        return Arrays.asList("ziemniaki", "schabowy", "marchewka");
    }
}
