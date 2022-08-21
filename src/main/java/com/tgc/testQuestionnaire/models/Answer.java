package com.tgc.testQuestionnaire.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "answer_text")
    private String answerText;

    @Column(name = "is_right")
    private boolean isRight;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    @ToString.Exclude
    private Question question;
}
