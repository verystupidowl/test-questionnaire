package com.tgc.testQuestionnaire.repositories;

import com.tgc.testQuestionnaire.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
