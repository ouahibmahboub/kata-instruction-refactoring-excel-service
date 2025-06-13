package com.newlight77.kata.survey.service;


import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;

public interface CampagneService {
    void createCampagne(Campaign campaign);
    Campaign getCampaign(String id);
    void createSurvey(Survey survey);
    Survey getSurvey(String id);
    void exportCampaign(String campaignId);


}
