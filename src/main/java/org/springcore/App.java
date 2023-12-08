package org.springcore;

import org.springcore.beanLifeCycle.Student;
import org.springcore.pojo.Employee;
import org.springcore.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("App.class");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/config.xml");
//        ApplicationContext employeeApplicationContex= new ClassPathXmlApplicationContext("file:src/main/java/org/springcore/pojo/EmployeeConfig.xml");
//        ApplicationContext userApplicationContext = new ClassPathXmlApplicationContext("file:src/main/java/config.xml");
//
//        ConfigurableApplicationContext constructorUserApplication = new ClassPathXmlApplicationContext("file:src/main/java/org/springcore/pojo/userConfig.xml");
//
//        User user = (User) applicationContext.getBean("user3");
//        Employee employee = (Employee) employeeApplicationContex.getBean("employee");
//        User userWithAddress = (User) userApplicationContext.getBean("userWithAddress");
//        User userConstructor =  (User) constructorUserApplication.getBean("user2");
//
//        System.out.println( "Hello World! "+employee.getNameList());
//        System.out.println("Reference Example "+userWithAddress.getAddress().getCityName());
//        System.out.println("User with Constructor injection "+userConstructor.getAddress().getCityName());

//        constructorUserApplication.close();//it will call the destroy method of user class

        ConfigurableApplicationContext studentCotext = new ClassPathXmlApplicationContext("file:src/main/java/org/springcore/beanLifeCycle/studentConfig.xml");
//        Student student1 = (Student) studentCotext.getBean("student1");
//        Student student2 = (Student) studentCotext.getBean("student2");
//        Student studentAnnotation = (Student) studentCotext.getBean("studentAnnotation");
//
//        logger.info("Student1 name "+student1.getStudentName());

        studentCotext.close();

    }
}
