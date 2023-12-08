package org.springcore.stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@Component("student1")
public class Student {

    @Value("same")
    private String studentName;
    @Value("1001")
    private String studentId;

    @Value("indore")
    private String studentCity;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
