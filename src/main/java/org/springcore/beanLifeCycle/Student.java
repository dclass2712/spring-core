package org.springcore.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.logging.Logger;
public class Student implements InitializingBean, DisposableBean {

    Logger logger = Logger.getLogger("Student.class");
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        logger.info("Student constructor call");
        this.studentName = studentName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Student bean initializing");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Student bean destroy");
    }
}
