package edu.miu.waapmp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private LocalDate date;
    private String activityType;
    private String status;

    @ManyToOne
    private Users users;
    @ManyToOne
    private Property property;
}
