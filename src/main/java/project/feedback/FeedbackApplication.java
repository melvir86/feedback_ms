package project.feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);
	}

}
