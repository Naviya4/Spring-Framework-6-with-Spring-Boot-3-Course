package com.navindu.app.service;

import com.navindu.app.model.Laptop;
import com.navindu.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}