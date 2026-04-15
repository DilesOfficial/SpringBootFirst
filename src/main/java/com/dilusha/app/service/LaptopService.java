package com.dilusha.app.service;

import com.dilusha.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Method Called");
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
