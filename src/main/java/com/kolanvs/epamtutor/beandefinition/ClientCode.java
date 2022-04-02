package com.kolanvs.epamtutor.beandefinition;

import com.kolanvs.epamtutor.beans.Developer;
import com.kolanvs.epamtutor.beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Developer dev = (Developer) context.getBean("dev");
        System.out.println(dev);

        Developer intern = (Developer) context.getBean("intern");
        intern.setSkill("Petuhon");
        intern.setLevel(-1);
        System.out.println(intern);

        Developer dotNetLena = context.getBean("dotNetDev", Developer.class);
        System.out.println(dotNetLena);

        Developer anon = context.getBean("anon", Developer.class);
        System.out.println(anon);

        Project taxiBumer = context.getBean("taxiBumer", Project.class);
        System.out.println(taxiBumer);

        Project javaProject = context.getBean("java_10", Project.class);
        System.out.println(javaProject);

    }

}
