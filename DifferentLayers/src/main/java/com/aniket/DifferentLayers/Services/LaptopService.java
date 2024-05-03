package com.aniket.DifferentLayers.Services;

import com.aniket.DifferentLayers.Model.Laptop;
import com.aniket.DifferentLayers.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired //Field injection
    LaptopRepository repository;
    public void addLaptop(Laptop laptop) {
        // logic

        //save the laptop in the database
        repository.save(laptop);

    }

    public boolean isGoodForPro(Laptop laptop) {
        return true;
    }
}
