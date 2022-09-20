package com.sykang.swaggertest.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class mariadbDao {
    protected static final String NAMESPACE = "com.sykang.swaggertest.dao.mariadbDao.";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession sqlSession;

    public List<Object> selectAlarms() {
        logger.debug("selectIam DAO >> ");
        return sqlSession.selectList(NAMESPACE + "selectAlarms");
    }


}
