package com.example.ppro_c.service;

import com.example.ppro_c.model.Driver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DriverServiceImpl implements DriverService{

    ArrayList<Driver> drivers = new ArrayList<>();

    @Override
    public ArrayList<Driver> getAllDrivers() {
        return drivers;
    }

    @Override
    public Driver getDriverById(int id) {
        if(id > -1 && id < drivers.size()){
            return drivers.get(id);
        }
        return null;
    }

    @Override
    public void deleteDriverById(int id) {
        if(id > -1 && id < drivers.size()){
            drivers.remove(id);
        }
    }

    @Override
    public void saveDriver(Driver driver) {
        if(driver.getId() > -1 && driver.getId() < drivers.size()){
            drivers.remove(driver.getId());
        }
        drivers.add(driver);
    }


}
