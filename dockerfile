FROM maven:3.8.7-openjdk-18
WORKDIR /fakeHRM
COPY pom.xml .
RUN mvn -B dependency:resolve
COPY src /fakeHRM/src
RUN mvn clean  install
RUN export JAVA_HOME="$(dirname $(dirname $(readlink -f $(openjdk-17 java))))"
CMD mvn spring-boot:run

