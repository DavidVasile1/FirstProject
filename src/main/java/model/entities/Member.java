package model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Member {

    private String cnp;
    private String firstName;
    private String lastName;
}
