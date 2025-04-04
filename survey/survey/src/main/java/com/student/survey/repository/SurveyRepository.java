package com.student.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.survey.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
