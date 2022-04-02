package com.kolanvs.epamtutor.beandefinition;

import com.kolanvs.epamtutor.beans.Developer;
import com.kolanvs.epamtutor.beans.Manager;
import com.kolanvs.epamtutor.beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Project project = context.getBean("newYorkTimes", Project.class);

        System.out.println(project);

        context.close();
    }

}
