package org.springcore.autowiring.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class AutowireMain {
     public static void main(String args[]){

         Logger logger = Logger.getLogger("AutowireMain.class");

         ConfigurableApplicationContext configurableApplicationContext1 = new ClassPathXmlApplicationContext("file:src/main/java/org/springcore/autowiring/annotation/config.xml");

         Employee employee = configurableApplicationContext1.getBean("employee", Employee.class);

         logger.info("employee object= "+employee);

     }
}
