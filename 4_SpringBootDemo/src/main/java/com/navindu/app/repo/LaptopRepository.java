package com.navindu.app.repo;

import com.navindu.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database.");
    }
}