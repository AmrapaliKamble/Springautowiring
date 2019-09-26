package com.bv.Spring_demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.model.Employee;
import com.bv.model.Person;
import com.bv.model.Student;
import com.bv.model.Triangle;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
     //Employee employee = (Employee) context.getBean("employee");
    /* Employee employee = context.getBean(Employee.class);
     System.out.println(employee.getId() +" "+employee.getName()+" "+employee.getAddress()+" "+employee.getDoj());
     Triangle triangle = context.getBean(Triangle.class);
      triangle.draw();*/
     
     /* Student student = context.getBean(Student.class);
      System.out.println(student.getStudentId()+" "+student.getStudentName());
      student.printAddress();
      */
      
      Person person =context.getBean(Person.class);
      System.out.println(person.getId()+" "+person.getName()+" "+person.getAge()+" "+person.getAddress());
    }
}
