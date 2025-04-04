package com.student.survey.service;

import com.student.survey.model.Survey;
import com.student.survey.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    private final SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Survey updateSurvey(Long id, Survey surveyDetails) {
        Survey survey = surveyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Survey not found with id: " + id));

        survey.setFirstName(surveyDetails.getFirstName());
        survey.setLastName(surveyDetails.getLastName());
        survey.setEmail(surveyDetails.getEmail());
        survey.setStreetAddress( surveyDetails.getStreetAddress());
        survey.setCity(surveyDetails.getCity());
        survey.setState(surveyDetails.getState());
        survey.setZipCode(surveyDetails.getZipCode());
        survey.setTelephoneNumber( surveyDetails.getTelephoneNumber());
        survey.setSurveyDate(surveyDetails.getSurveyDate());
        survey.setLikedMost( surveyDetails.getLikedMost());
        survey.setInterestSource( surveyDetails.getInterestSource());
        survey.setRecommendation( surveyDetails.getRecommendation());
        return surveyRepository.save(survey);
    }

    public void deleteSurvey(Long id) {
        Survey survey = surveyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Survey not found with id: " + id));
        surveyRepository.delete(survey);
    }
}
