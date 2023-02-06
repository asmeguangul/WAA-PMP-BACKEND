package edu.miu.waapmp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private boolean isActive;
    private String password;
    @ManyToMany
    private List<Property> properties;

//    @OneToMany(mappedBy = "users")
//    private List<Role> roles;

    @OneToMany(mappedBy = "users")
    private List<Activity> activities;

}