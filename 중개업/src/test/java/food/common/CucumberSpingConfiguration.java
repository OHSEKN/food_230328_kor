package food.common;

import food.중개업Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 중개업Application.class })
public class CucumberSpingConfiguration {}
