package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



@SpringBootApplication
@EnableConfigServer
public class Application {
	
	private static final Logger logger = LogManager.getLogger(Application.class);

  public static void main(String[] args) {
	  logger.info("Starting CONFIG-SERVER");
    SpringApplication.run(Application.class, args);
  }

}