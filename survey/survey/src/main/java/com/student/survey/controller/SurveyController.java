package com.student.survey.controller;

import com.student.survey.model.Survey;
import com.student.survey.service.SurveyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping
    public List<Survey> getSurveys() {
        return surveyService.getAllSurveys();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Survey createSurvey(@Valid @RequestBody Survey survey) {
        return surveyService.createSurvey(survey); // get the data from the request body
    }

    @PutMapping("/{id}")
    public Survey updateSurvey(@PathVariable Long id, @Valid @RequestBody Survey survey) {
        return surveyService.updateSurvey(id, survey);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
    }
}
