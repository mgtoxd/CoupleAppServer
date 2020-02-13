package pers.mtx.love;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LoveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoveApplication.class, args);
    }

}
