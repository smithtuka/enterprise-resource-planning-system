package com.galbern.requisitionservice.service;

import com.galbern.requisitionservice.domain.Stage;

import java.util.List;

public interface StageService {
    public Stage create(Stage stage);
    public Stage find(Long id);
    public List<Stage> findAll();
    public void update(Long id, Stage stage);
    public void delete(Long id);

    public Stage findById(Long id);
}
