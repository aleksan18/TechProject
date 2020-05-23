package com.example.demo.Repository;

import com.example.demo.Model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ApartmentRepo {

    @Autowired
    JdbcTemplate template;

    public List<Apartment> fetchAll(){
        String sql = "SELECT * FROM apartments;";
        RowMapper<Apartment> rowMapper = new BeanPropertyRowMapper<>(Apartment.class);
        return template.query(sql, rowMapper);
    }

    public Apartment addApartment(Apartment apartment){
        return null;
    }

    public Apartment findApartmentById(int id){
        return null;
    }

    public Apartment updateApartment(int id, Apartment apartment){
        return null;
    }

    public Boolean deleteApartment(int id){
        return null;
    }
}
