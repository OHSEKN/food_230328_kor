package food.common;

import food.사용자Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 사용자Application.class })
public class CucumberSpingConfiguration {}
