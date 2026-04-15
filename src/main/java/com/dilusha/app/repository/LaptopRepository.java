package com.dilusha.app.repository;

import com.dilusha.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database");
    }
}
