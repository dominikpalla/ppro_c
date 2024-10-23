package com.example.ppro_c.service;

import com.example.ppro_c.model.Driver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface DriverService {

    ArrayList<Driver> getAllDrivers();
    Driver getDriverById(int id);
    void deleteDriverById(int id);
    void saveDriver(Driver car);
}
