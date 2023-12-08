package org.springcore.removeConfigXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutConfigXmlMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = applicationContext.getBean("getStudent", Student.class);
        student.printName();
    }
}
