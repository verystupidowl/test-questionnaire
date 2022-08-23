package com.tgc.testQuestionnaire.repositories;

import com.tgc.testQuestionnaire.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
