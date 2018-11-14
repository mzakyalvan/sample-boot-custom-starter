package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.Assert;

@SpringBootApplication
public class SampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);
  }

  @Autowired
  private RequireSampleBean sampleComponent;

  @Bean
  ApplicationRunner applicationRunner() {
    return args -> {
      Assert.notNull(sampleComponent.getSampleBean().getConnectionFactory());
    };
  }
}
