package food.common;

import food.대시보드Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 대시보드Application.class })
public class CucumberSpingConfiguration {}
