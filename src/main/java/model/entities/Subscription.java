package model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate startData;
    private LocalDate endData;
    @OneToOne
    private Members member;
    @OneToMany
    private List<Classes> classes;
    @ManyToMany
    private List<Gyms> gyms;


}
