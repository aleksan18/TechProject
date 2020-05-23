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

    public void addApartment(Apartment apartment){
        String sql = "INSERT INTO apartments VALUES (DEFAULT, ?, ?, ?, ?, ?, ?);";
        template.update(sql, apartment.getAddress(), apartment.getZip(), apartment.getSize(),
                        apartment.getFloor(), apartment.getHas_furniture(),apartment.getPrice());
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
