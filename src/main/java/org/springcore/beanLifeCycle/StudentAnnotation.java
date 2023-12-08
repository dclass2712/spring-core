package org.springcore.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

public class StudentAnnotation {

    Logger logger = Logger.getLogger("StudentAnnotation.class");

    private String studentAnnotation;

    public StudentAnnotation() {
        logger.info("StudentAnnotation constructor called");
    }

    public String getStudentAnnotation() {
        return studentAnnotation;
    }

    public void setStudentAnnotation(String studentAnnotation) {
        this.studentAnnotation = studentAnnotation;
    }

    @PostConstruct
    public void init(){
        logger.info("StudentAnnotation.init called");
    }

    @PreDestroy
    public void destroy(){
        logger.info("StudentAnnotation.destroy called");
    }
}
