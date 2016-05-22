FROM java:8

EXPOSE 8080

RUN java -version

RUN  mkdir /opt/docker-spring-boot-scala-workweek
RUN  cd build/libs
COPY spring-boot-scala-microservice-0.1.0.jar /opt/docker-spring-boot-scala-workweek
RUN  mkdir /home/workweek-user
RUN  echo "#!/bin/bash                                                                 " >/home/workweek-user/start-service.sh
RUN  echo "cd /opt/docker-spring-boot-scala-workweek        "                           >>/home/workweek-user/start-service.sh
RUN  echo "java -jar spring-boot-scala-microservice-0.1.0.jar   "                       >>/home/workweek-user/start-service.sh
RUN  chmod +x /home/workweek-user/start-service.sh
CMD  /home/workweek-user/start-service.sh

