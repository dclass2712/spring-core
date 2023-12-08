package org.springcore.removeConfigXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This .java file is fully replaced the config.xml file and take a position as a config file it fully replaced the config.xml file
@Configuration
@ComponentScan("/home/dell/Desktop/springcore/src/main/java/org/springcore/removeConfigXML")
public class StudentConfig {

    @Bean //At the place of the <bean> tag in application
    public Student getStudent(){
        return new Student("Same", this.getAddress());
    }

    @Bean
    public Address getAddress(){
        return new Address("Indore");
    }
}
