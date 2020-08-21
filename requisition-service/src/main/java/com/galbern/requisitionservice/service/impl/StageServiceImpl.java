package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Stage;
import com.galbern.requisitionservice.repository.StageRepository;
import com.galbern.requisitionservice.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StageServiceImpl implements StageService {
    @Autowired
    private StageRepository stageRepository;
    @Override
    public Stage create(Stage stage) {
        return stageRepository.save(stage);
    }

    @Override
    public Stage find(Long id) {
        return stageRepository.findById(id).get();
    }

    @Override
    public List<Stage> findAll() {
        return stageRepository.findAll();
    }

    @Override
    public void update(Long id, Stage stage) {
        Stage stage1 = stageRepository.findById(id).get();
        stage1.setName(stage.getName());
        stage1.setIsActive(stage.getIsActive());
        stage1.setProject(stage.getProject());
        stage1.setRequisitions(stage.getRequisitions());
        stage1.setStageBudget(stage.getStageBudget());
        stage1.setStatus(stage.getStatus());
        stage1.setSupervisor(stage.getSupervisor());
        stageRepository.save(stage1);
    }

    @Override
    public void delete(Long id) {
        stageRepository.deleteById(id);
    }

    @Override
    public Stage findById(Long id) {
        return stageRepository.findById(id).get();
    }
}
