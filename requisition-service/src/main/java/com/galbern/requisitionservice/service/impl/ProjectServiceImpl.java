package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Project;
import com.galbern.requisitionservice.repository.ProjectRepository;
import com.galbern.requisitionservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project find(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public void update(Long id, Project project) {
        Project project1 = projectRepository.findById(id).get();
        project1.setName(project.getName());
        project1.setCustomer(project.getCustomer());
        project1.setProjectManager(project.getProjectManager());
        project1.setStages(project.getStages());
        projectRepository.save(project1);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project findById(Long id) {
        return projectRepository.findById(id).get();
    }
}

