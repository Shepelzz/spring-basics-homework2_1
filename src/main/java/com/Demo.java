package com;

import com.model.Route;
import com.model.Service;
import com.model.Step;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-servlet.xml");

        Service service1 = context.getBean(Service.class);
            service1.setId(1L);

        Service service2 = context.getBean(Service.class);
            service2.setId(2L);

        Step step1 = context.getBean(Step.class);
            step1.setId(1L);
            step1.setServiceFrom(service1);
            step1.setServiceTo(service2);

        Step step2 = context.getBean(Step.class);
            step2.setId(2L);
            step2.setServiceFrom(service1);
            step2.setServiceTo(service2);

        Step step3 = context.getBean(Step.class);
            step3.setId(3L);
            step3.setServiceFrom(service1);
            step3.setServiceTo(service2);

        Route route = context.getBean(Route.class);
            route.setId("1");
            List list = new ArrayList();
            list.add(step1);
            list.add(step2);
            list.add(step3);
            route.setSteps(list);

        //теперь так же по очереди вызвать геттеры? или что? ..
        System.out.println(route.getId());
        System.out.println(service1.getId());
        System.out.println(step1.getId());

    }
}
