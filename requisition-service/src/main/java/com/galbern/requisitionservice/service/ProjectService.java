package com.galbern.requisitionservice.service;
import com.galbern.requisitionservice.domain.Project;

import java.util.List;

public interface ProjectService {
    public Project create(Project project);
    public Project find(Long id);
    public List<Project> findAll();
    public void update(Long id, Project project);
    public void delete(Long id);

    public Project findById(Long id);
}