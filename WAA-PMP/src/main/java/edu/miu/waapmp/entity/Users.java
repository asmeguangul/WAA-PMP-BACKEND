package edu.miu.waapmp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
    private String password;
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Property> properties;

//    @OneToMany(mappedBy = "users")
//    private List<Role> roles;
//
//    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
//    private List<Activity> activities;

}
