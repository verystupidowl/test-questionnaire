package com.tgc.testQuestionnaire.models;

import lombok.*;

import javax.persistence.*;

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
    @Column(name = "'id'")
    private int id;

    @Column(name = "'name'")
    private String name;

    @Column(name = "'password'")
    private String password;

    @Column(name = "'total_points'")
    private int totalPoints;

    @Column(name = "'role'")
    private String role;

//    @ManyToMany
//    @JoinTable(
//            name = "user_questionnaire",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "questionnaire_id")
//    )
//    private List<Questionnaire> questionnaires;
}
