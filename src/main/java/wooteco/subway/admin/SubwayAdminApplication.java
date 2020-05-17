package wooteco.subway.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SubwayAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(SubwayAdminApplication.class, args);
	}
}
