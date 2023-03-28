package food.common;

import food.매장Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 매장Application.class })
public class CucumberSpingConfiguration {}
