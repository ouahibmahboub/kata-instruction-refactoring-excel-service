package com.newlight77.kata.survey.service;

import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class CampagneServiceImpl implements CampagneService {
    private final CampaignClientService campagneService;
    private final IExportService exportService ;

    public CampagneServiceImpl(CampaignClientService campagneService, IExportService exportService) {
        this.campagneService = campagneService;
        this.exportService = exportService;
    }

    @Override
    public void createCampagne(Campaign campaign) {
        campagneService.createCampaign(campaign);
    }

    @Override
    public Survey getSurvey(String id) {
        return campagneService.getSurvey(id);
    }

    @Override
    public Campaign getCampaign(String id) {

        return campagneService.getCampaign(id);
    }

    @Override
    public void createSurvey(Survey survey) {
        campagneService.createSurvey(survey);
    }

    @Override
    public void exportCampaign(String campaignId) {
        Campaign campaign = campagneService.getCampaign(campaignId);
        Survey survey = campagneService.getSurvey(campaign.getSurveyId());
        exportService.export(campaign, survey);

    }
}
