package com.example.jeeioa.entities;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    private String name;

    private String responsible;

    private String schoolYear;
}
