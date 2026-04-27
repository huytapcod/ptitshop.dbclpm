package ptitshop.ptithcm.dbclpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class DbclpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbclpmApplication.class, args);
	}

}
