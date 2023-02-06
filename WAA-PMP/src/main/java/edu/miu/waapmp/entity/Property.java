package edu.miu.waapmp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String propertyType;
    private double price;
    private int numberOfRooms;
    private String homeType;
    private int viewCount;
    private String location;

    @ManyToMany(mappedBy = "properties")
    private List<Users> users;

    @OneToMany(mappedBy = "property")
    private List<Activity> activities;


}
