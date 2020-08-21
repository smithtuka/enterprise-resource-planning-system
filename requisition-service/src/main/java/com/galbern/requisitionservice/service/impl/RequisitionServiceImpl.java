package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Requisition;
import com.galbern.requisitionservice.repository.RequisitionRepository;
import com.galbern.requisitionservice.service.RequisitionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RequisitionServiceImpl implements RequisitionService {
    @Autowired
    private RequisitionRepository requisitionRepository;
    @Override
    public Requisition create(Requisition requisition) {
        return requisitionRepository.save(requisition);
    }

    @Override
    public Requisition find(Long id) {
        return requisitionRepository.findById(id).get();
    }

    @Override
    public List<Requisition> findAll() {
        return requisitionRepository.findAll();
    }

    @Override
    public void update(Long id, Requisition requisition) {
        Requisition requisition1 = requisitionRepository.findById(id).get();
        requisition1.setItems(requisition.getItems());
        requisition1.setRequester(requisition.getRequester());
        requisition1.setRequiredDate(requisition.getRequisitionDate());
        requisition1.setRequisitionDate(requisition.getRequisitionDate());
        requisition1.setStage(requisition.getStage());
        requisition1.setStatus(requisition.getStatus());
        requisitionRepository.save(requisition1);
    }

    @Override
    public void delete(Long id) {
        requisitionRepository.deleteById(id);
    }

    @Override
    public Requisition findById(Long id) {
        return requisitionRepository.findById(id).get();
    }



}

