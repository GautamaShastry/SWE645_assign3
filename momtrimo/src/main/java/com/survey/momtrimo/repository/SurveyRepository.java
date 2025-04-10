package com.survey.momtrimo.repository;

import com.survey.momtrimo.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
