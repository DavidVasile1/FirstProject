package org.example.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Table(name = "gyms",schema = "gymschema")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gyms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String location;
    private String program;
    @OneToMany(mappedBy = "gym",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Classes> classes;
}
