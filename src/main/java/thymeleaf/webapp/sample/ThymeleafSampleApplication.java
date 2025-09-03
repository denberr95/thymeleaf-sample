package thymeleaf.webapp.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.context.WebServerPortFileWriter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ThymeleafSampleApplication {

    public static void main(String[] args) {
        final SpringApplication springApplication =
                new SpringApplication(ThymeleafSampleApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter(),
                new WebServerPortFileWriter());
        springApplication.run(args);
    }
}
