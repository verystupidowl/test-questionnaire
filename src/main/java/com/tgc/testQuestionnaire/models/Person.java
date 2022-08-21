package com.tgc.testQuestionnaire.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "total_points")
    private int totalPoints;

    @Column(name = "role")
    private String role;

    @ManyToMany
    @JoinTable(
            name = "person_questionnaire",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "questionnaire_id")
    )
    @ToString.Exclude
    private List<Questionnaire> questionnaires;
}
