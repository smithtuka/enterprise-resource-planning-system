package com.galbern.requisitionservice.service;

import com.galbern.requisitionservice.domain.Requisition;

import java.util.List;

public interface RequisitionService {
    public Requisition create(Requisition requisition);
    public Requisition find(Long id);
    public List<Requisition> findAll();
    public void update(Long id, Requisition requisition);
    public void delete(Long id);

    public Requisition findById(Long id);
}