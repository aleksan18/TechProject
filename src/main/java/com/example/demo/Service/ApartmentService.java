package com.example.demo.Service;

import com.example.demo.Model.Apartment;
import com.example.demo.Repository.ApartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {

    @Autowired
    ApartmentRepo apartmentRepo;

    public List<Apartment> fetchAll(){
        return apartmentRepo.fetchAll();
    }

    public void addApartment(Apartment apartment){
        apartmentRepo.addApartment(apartment);
    }

    public Apartment findApartmentById(int id){
        return apartmentRepo.findApartmentById(id);
    }

    public Apartment updateApartment(int id, Apartment apartment){
        return apartmentRepo.updateApartment(id, apartment);
    }

    public void deleteApartment(int id){
        apartmentRepo.deleteApartment(id);
    }
}
