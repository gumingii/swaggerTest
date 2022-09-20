package com.sykang.swaggertest.service;

import com.sykang.swaggertest.dao.mariadbDao;
import com.sykang.swaggertest.vo.describeAlarmsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class awsServiceImpl implements awsServiceInterface{

    @Autowired
    private mariadbDao mariadbDao;


}
