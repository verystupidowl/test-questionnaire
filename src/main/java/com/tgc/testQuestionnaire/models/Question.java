package com.tgc.testQuestionnaire.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_text")
    private String questionText;

    @OneToMany(mappedBy = "question")
    @ToString.Exclude
    private List<Answer> answers;
}
