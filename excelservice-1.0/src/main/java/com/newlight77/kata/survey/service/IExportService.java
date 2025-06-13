package com.newlight77.kata.survey.service;


import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;

import java.io.File;

public interface IExportService {
    File export(Campaign campaign, Survey survey);
}
