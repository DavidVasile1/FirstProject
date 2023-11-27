package org.example.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Table(name = "classes",schema = "gymschema")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String trainerName;
    private String program;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "classes_subscription",
            joinColumns = @JoinColumn(name="classes_id"),
            inverseJoinColumns = @JoinColumn(name = "subscription_id")
    )
    private List <Subscription> subscriptions;
    @ManyToOne
    private Gyms gym;
}