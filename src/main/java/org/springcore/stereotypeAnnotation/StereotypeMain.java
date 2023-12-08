package org.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class StereotypeMain {

    public static void main(String args[]){

        Logger logger = Logger.getLogger("StereotypeMain.class");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/org/springcore/stereotypeAnnotation/config.xml");

        Student student = applicationContext.getBean("studentSingleton", Student.class);
        Student student2 = applicationContext.getBean("studentSingleton", Student.class);

//        logger.info("student bean by @Component stereotype annotation "+student.toString());
        logger.info("student hashCode : "+student.hashCode());
        logger.info("student2 hashCode : "+student2.hashCode());

    }
}
