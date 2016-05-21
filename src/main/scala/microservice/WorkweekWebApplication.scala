package microservice

import org.springframework.boot.SpringApplication

object WorkweekWebApplication extends App {
  SpringApplication.run(classOf[WorkweekConfig]);
}