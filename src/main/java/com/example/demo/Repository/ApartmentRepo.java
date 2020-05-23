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
        String sql = "SELECT * FROM apartments WHERE apID = ?;";
        RowMapper<Apartment> rowMapper = new BeanPropertyRowMapper<>(Apartment.class);
        Apartment apartment = template.queryForObject(sql, rowMapper, id);
        return apartment;
    }

    public Apartment updateApartment(int id, Apartment apartment){
        String sql = "UPDATE apartments SET address = ?, zip = ?, rent = ?, size = ?, floor = ?, has_furniture = ? WHERE apID = ?";
        template.update(sql, apartment.getAddress(), apartment.getZip(),apartment.getPrice(), apartment.getSize(), apartment.getFloor(), apartment.getHas_furniture(), apartment.getApID());
        return null;
    }
    public void deleteApartment(int id){
        String sql = "DELETE FROM apartments WHERE apID = ?;";
        template.update(sql, id);
    }
}
