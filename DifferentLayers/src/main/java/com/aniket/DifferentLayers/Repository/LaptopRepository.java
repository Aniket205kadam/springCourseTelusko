package com.aniket.DifferentLayers.Repository;

import com.aniket.DifferentLayers.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {

        //write the JDBC steps

        System.out.println("Laptop details is stored on the database");
    }
}
