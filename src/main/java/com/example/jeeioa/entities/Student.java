package com.example.jeeioa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "accountUM5R_id")
    @JsonIgnore //evite de sérialiser cette propriété lors de la conversion de l'objet en JSON
    private AccountUM5R accountUM5R;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom;
}
