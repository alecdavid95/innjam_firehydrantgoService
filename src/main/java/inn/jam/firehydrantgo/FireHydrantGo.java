package inn.jam.firehydrantgo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FireHydrantGo implements CommandLineRunner {

	
	public static void main(final String[] args) {
		SpringApplication.run(FireHydrantGo.class, args);
	}
	
	@Override
	public void run(final String... args) throws Exception {
	}
}
