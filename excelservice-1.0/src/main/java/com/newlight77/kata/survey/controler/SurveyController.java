package com.newlight77.kata.survey.controler;

import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.CampagneService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SurveyController {

    private final CampagneService campaignService;

    private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);

    @PostMapping(value = "/survey")
    public void createSurvey(@RequestBody Survey survey) {
        logger.info("createSurvey called, {}", survey);
        campaignService.createSurvey(survey);
    }

    @GetMapping(value = "/survey/{id}")
    public Survey getSurvey(@PathVariable String id) {
        logger.info("getSurvey with ID: {}", id);
        return campaignService.getSurvey(id);
    }

    @PostMapping(value = "/campaign")
    public void createCampaign(@RequestBody Campaign campaign) {
        logger.info("createCampaign called, {}", campaign);
        campaignService.createCampagne(campaign);
    }

    @GetMapping(value = "/campaign/{id}")
    public Campaign getCampaign(@PathVariable String id) {
        logger.info("getCampaign with ID: {}", id);
        return campaignService.getCampaign(id);
    }

    @PostMapping(value = "/campaign/{id}/export")
    public void exportCampaign(@PathVariable String id) {
        logger.info("Exporting Campaign with id, {}", id);
        campaignService.exportCampaign(id);
    }
}

