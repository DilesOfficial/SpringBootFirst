package com.dilusha.app;

import com.dilusha.app.model.Alien;
import com.dilusha.app.model.Laptop;
import com.dilusha.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();



    }

}
