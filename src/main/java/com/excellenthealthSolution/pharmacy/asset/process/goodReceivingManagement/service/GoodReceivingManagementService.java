package com.excellenthealthSolution.pharmacy.asset.process.goodReceivingManagement.service;

import com.excellenthealthSolution.pharmacy.asset.process.goodReceivingManagement.dao.GoodReceivingManagementDao;
import com.excellenthealthSolution.pharmacy.asset.process.goodReceivingManagement.entity.GoodReceivingManagement;
import com.excellenthealthSolution.pharmacy.util.interfaces.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodReceivingManagementService implements AbstractService< GoodReceivingManagement, Long > {
    private final GoodReceivingManagementDao goodReceivingManagementDao;

    public GoodReceivingManagementService(GoodReceivingManagementDao goodReceivingManagementDao) {
        this.goodReceivingManagementDao = goodReceivingManagementDao;
    }

    @Override
    public List< GoodReceivingManagement > findAll() {
        return goodReceivingManagementDao.findAll();
    }

    @Override
    public GoodReceivingManagement findById(Long id) {
        return null;
    }

    @Override
    public GoodReceivingManagement persist(GoodReceivingManagement goodReceivingManagement) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List< GoodReceivingManagement > search(GoodReceivingManagement goodReceivingManagement) {
        return null;
    }
}
